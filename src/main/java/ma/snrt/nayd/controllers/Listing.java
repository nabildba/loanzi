package ma.snrt.nayd.controllers;

import ma.snrt.nayd.models.Magasin;
import ma.snrt.nayd.models.Rubric;
import ma.snrt.nayd.models.SupportFormat;
import ma.snrt.nayd.models.SupportType;
import ma.snrt.nayd.repositories.MagasinRepository;
import ma.snrt.nayd.repositories.RubricRepository;
import ma.snrt.nayd.repositories.SupportFormatRepository;
import ma.snrt.nayd.repositories.SupportTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by nabil on 02/02/2018.
 */
@RestController
@RequestMapping("nayd/list/")
public class Listing {
    @Autowired
    MagasinRepository magasinRepository;

    @RequestMapping("magasins")
    public List<Magasin> listMagasins(){
        return magasinRepository.findAll();
    }


    @Autowired
    SupportFormatRepository supportFormatRepository;
    //get list of supports
    @RequestMapping(value = "suppformats", method = RequestMethod.GET)
    public List<SupportFormat> listFormats(){
        List<SupportFormat> lst= supportFormatRepository.findAllByActive(1);
        return lst;
    }

    @Autowired
    SupportTypeRepository supportTypeRepository;
    @RequestMapping("supptypes")
    public List<SupportType> listTypes(){
        return supportTypeRepository.findAll();
    }

    @Autowired
    RubricRepository rubricRepository;
    @RequestMapping("rubrics")
    public List<Rubric> listRubrics(){
        return rubricRepository.findAll();
    }
}
