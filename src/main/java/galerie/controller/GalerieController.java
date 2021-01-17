/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package galerie.controller;

import galerie.dao.GalerieRepository;
import galerie.entity.Galerie;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Tina Nantenaina
 */
@Controller
@RequestMapping(path="/galeries/show")
public class GalerieController {
    @Autowired
    private GalerieRepository galerieDAO;
    public String afficheGalerie(Model model){
        List<Galerie> galerieList = galerieDAO.findAll();
        model.addAttribute("listegalerie", galerieList);
        return "Listegaleries";
    }
}
