package com.heh.projetjava.adaptater.in;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.view.RedirectView;

import com.heh.projetjava.domain.model.Phone;
import com.heh.projetjava.domain.port.in.PhonePortIn;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Controller
@RequiredArgsConstructor
public class PhoneController {

    @Getter
    private final PhonePortIn phonePortIn;
    @Getter
    @Setter
    private List<Phone> phoneList;

    @GetMapping("/")
    public String getPhoneList(Model model){
        setPhoneList(getPhonePortIn().getPhoneList());
        List<Long>longs = new ArrayList<>();
        for(Phone ph:getPhoneList()){
            longs.add(ph.getId());
        }
        Collections.sort(longs);
        getPhoneList().clear();
        for(Long id:longs){
            Phone newPr = phonePortIn.selectId(id);
            getPhoneList().add(newPr);
        }
        model.addAttribute("phones",getPhoneList());
        return "phoneList";
    }
    @GetMapping("/addPhone")
    public String addPhone(){
        return "addPhone";
    }
    @GetMapping("/updatePhone")
    public String updatePhone(){
        return "updatePhone";
    }
    @PostMapping("/addPhoneForm")
    @ResponseBody
    public RedirectView addView(@ModelAttribute("addPhone") Phone phone) throws Exception{
        Phone phone1 = new Phone(Long.parseLong(phone.getId().toString()),phone.getMarque(),phone.getModele(),phone.getCapacite());
        phonePortIn.addPhone(phone1);
        return new RedirectView("/");
    }
    @PostMapping("/deletePhoneForm")
    public RedirectView deletePhone(@ModelAttribute("phoneList") Phone phone){
        phonePortIn.deletePhone(phone.getId());
        return new RedirectView("/");
    }
    @PostMapping("/updatePhoneForm")
    public RedirectView updatePhoneView(@ModelAttribute("phoneList") Phone phone){
        Phone phone1 = new Phone(Long.parseLong(phone.getId().toString()),phone.getMarque(),phone.getModele(),phone.getCapacite());
        phonePortIn.updatePhone(phone1);
        return new RedirectView("/");
    }
    
    
}
