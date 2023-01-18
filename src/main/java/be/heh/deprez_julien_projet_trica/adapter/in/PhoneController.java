package be.heh.deprez_julien_projet_trica.adapter.in;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import be.heh.deprez_julien_projet_trica.domain.model.Phone;
import be.heh.deprez_julien_projet_trica.domain.port.in.PhonePortIn;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Controller
@RequiredArgsConstructor
public class PhoneController {

    @Getter //On déclare un getter pour récupérer l'attribut phonePortIn
    private final PhonePortIn phonePortIn;
    @Getter //On déclare un getter pour récupérer l'attribut phoneList
    @Setter //On déclare un setter pour définir l'attribut phoneList
    private List<Phone> phoneList;

    @GetMapping("/")
    public String getPhoneList(Model model){
        setPhoneList(getPhonePortIn().getPhoneList()); //On utilise le setter pour définir la valeur de phoneList en utilisant le getPhoneList de PhonePortIn
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
        return "phoneList"; //On retourne la vue phoneList
    }
    @GetMapping("/addPhone")
    public String addPhone(){
        return "addPhone"; //On retourne la vue addPhone
    }
    @PostMapping("/updatePhone")
    public String updatePhone(@ModelAttribute("updatePhone")Phone phone, Model model){
        Long id = phone.getId();
        Phone phone1 = phonePortIn.selectId(id);
        model.addAttribute("phone",phone1);
        return "updatePhone"; //On retourne la vue updatePhone
    }
    @PostMapping("/addPhoneForm")
    public RedirectView addView(@ModelAttribute("phoneList") Phone phone) throws Exception{
        Phone phone1 = new Phone(Long.parseLong(phone.getId().toString()),phone.getMarque(),phone.getModele(),phone.getCapacite());
        phonePortIn.addPhone(phone1);
        return new RedirectView("/"); //On redirige vers la racine de l'application
    }
    @PostMapping("/deletePhoneForm")
    public RedirectView deletePhone(@ModelAttribute("phoneList") Phone phone){
        phonePortIn.deletePhone(phone.getId());
        return new RedirectView("/"); //On redirige vers la racine de l'application
    }
    @PostMapping("/updatePhoneForm")
    public RedirectView updatePhoneView(@ModelAttribute("updatePhone") Phone phone) throws Exception{
        Phone phone1 = new Phone(Long.parseLong(phone.getId().toString()),phone.getMarque(),phone.getModele(),phone.getCapacite());
        phonePortIn.updatePhone(phone1);
        return new RedirectView("/"); //On redirige vers la racine de l'application
    }


}
