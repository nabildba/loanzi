package ma.snrt.nayd.controllers;


import ma.snrt.nayd.models.*;
import ma.snrt.nayd.repositories.*;
import ma.snrt.nayd.views.Support;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.Console;
import java.util.ArrayList;
import java.util.List;

@RestController
public class NaydRESTClient {
	@Autowired
	SupportFormatRepository supportFormatRepository;
	@Autowired
	SupportDocsRepository supportDocsRepository;
	@Autowired
	DocumentRepository documentRepository;
	@Autowired
	DetailLoanRepository detailLoanRepository;
	@Autowired
	SupportLastValRepository supportLastValRepository;


	@RequestMapping(value = "/testlogin", method = RequestMethod.POST)
	public Role home(@RequestParam("username") String username, @RequestParam("password") String password){
		return new Role(10,username +" "+ password);
	}

	@RequestMapping(value = "/nayd/support/{numsupport}", method = RequestMethod.GET)
	public Support support(@PathVariable("numsupport") String numSupport){
		String codeFOrmat="";
		String dottedSupp;
		if(numSupport.substring(0,1).equals("1")) {
			codeFOrmat = numSupport.substring(0, 3);
			dottedSupp=codeFOrmat+"."+numSupport.substring(3,5)+"."+numSupport.substring(5);
		}
		else {
			codeFOrmat = numSupport.substring(0, 2);
			dottedSupp=codeFOrmat+"."+numSupport.substring(2,4)+"."+numSupport.substring(4);

		}
		System.out.println(dottedSupp);

		SupportFormat format=supportFormatRepository.findOne(codeFOrmat);
		List<Document> doc=documentRepository.findAllBySupport(numSupport,dottedSupp);
		Support supp=new Support(numSupport,format,doc);
		return supp;
	}
	@RequestMapping(value = "/nayd/supports/{idcont}", method = RequestMethod.GET)
	public Document supports(@PathVariable("idcont") Integer idCont){
		List<SupportDoc> supps=supportDocsRepository.findAllByIdCont(idCont);
		List<String> lst=new ArrayList<>();

		for(SupportDoc sup:supps)
			lst.add(sup.getIdSupport());

		Document document=documentRepository.findOne(idCont.longValue());
		if(document!=null)
			document.setSupports(lst);

		return document;
	}
	//TODO return loaned support
	@RequestMapping(value = "/nayd/returnSupport/{numsupport}", method = RequestMethod.GET)
	public Boolean supports(@PathVariable("numsupport") String numSupport){
		DetailLoan detail= detailLoanRepository.findByIdSupport(numSupport);
		//TODO record the return of support
		return true;
	}

	//get the last val
	@RequestMapping(value = "/nayd/lastVal/{idformat}/{year}", method = RequestMethod.GET)
	public String getLastVal(@PathVariable("idformat") String idFormat, @PathVariable("year") Integer year){
		SupportLastVal lastval=supportLastValRepository.
				findSupportLastValByIdSupportFormatAndAndYear(idFormat,year);
		//TODO record the return of support
		return Integer.toString(lastval.getLastVal());
	}
	//set the last val
	@RequestMapping(value = "/nayd/lastVal/{idformat}/{year}/{lastval}", method = RequestMethod.GET)
	public Boolean setLastVal(@PathVariable("idformat") String idFormat,
							 @PathVariable("year") Integer year,
							 @PathVariable("lastval") Integer lastVal){
		SupportLastVal lastval=supportLastValRepository.
				findSupportLastValByIdSupportFormatAndAndYear(idFormat,year);
		lastval.setLastVal(lastVal);
		supportLastValRepository.save(lastval);
		return true;
	}
}
