package it.keyclient.atm.web.struts.actions;

import it.softeam.weblibrary.BusinessException;
import it.softeam.weblibrary.InfrastructureException;
import it.softeam.weblibrary.data.Pagination;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class ListAnRisorsaAction extends Action {
	  
	public ListAnRisorsaAction() {}
	
	public ActionForward execute(ActionMapping mapping,ActionForm form,
			HttpServletRequest request,HttpServletResponse response)
	        throws Exception {
			
			//HelloWorldForm helloWorldForm = (HelloWorldForm) form;
			//helloWorldForm.setMessage("Hello World! Struts");
			
			return mapping.findForward("success");
		}
	  
	public ActionForward cancella(ActionMapping mapping, ActionForm form, 
			HttpServletRequest request, HttpServletResponse response) throws Exception {
	    
		ActionForward fwd = mapping.findForward("accedi");

	    
	    return fwd;
	  }
	  




	  protected ActionForward getStartPage(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
	    throws Exception
	  {
	    //return ricerca(mapping, form, request, response);
		  return null;
	  }
	  

	  public Pagination eseguiRicerca(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
	    throws InfrastructureException, BusinessException
	  {
	    //AnRisorsaDAOCustom custom = new AnRisorsaDAOCustom(request);
	    return null;//custom.findByFormPaged(null, (ListAnRisorsaForm)form, getPaginationInfo(mapping, form, request));
	  }
	  



	  public ActionForward conferma(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
	    throws Exception
	  {
	    return null;
	  }
	  



	  public ActionForward inserisci(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
	    throws Exception
	  {
	    return null;
	  }
	  
	  public void predisponiAccedi(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
	    throws InfrastructureException
	  {}
}

