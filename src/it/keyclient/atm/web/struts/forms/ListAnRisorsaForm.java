package it.keyclient.atm.web.struts.forms;

import it.keyclient.atm.dataaccess.generated.AnRisorsa;
import it.softeam.weblibrary.data.BasicPojo;
import it.softeam.weblibrary.web.struts.BasicSearchForm;
import it.softeam.weblibrary.web.struts.IBasicForm;
import java.io.Serializable;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;

public class ListAnRisorsaForm extends BasicSearchForm implements IBasicForm
{
  private String codRisorsaForm;
  private String descrForm;
  
  public ListAnRisorsaForm() {}
  
  public BasicPojo toPojo(Serializable pojo)
  {
    if (pojo == null) {
      pojo = new AnRisorsa();
    }
    ((AnRisorsa)pojo).setCodRisorsa(getCodRisorsaForm());
    ((AnRisorsa)pojo).setDescr(getDescrForm());
    
    return (BasicPojo)pojo;
  }
  

  public void fromPojo(BasicPojo pojo) {}
  

  public ActionErrors validate(ActionMapping mapping, HttpServletRequest request)
  {
    ActionErrors errors = new ActionErrors();
    
    return errors;
  }
  

  public void reset(ActionMapping mapping, HttpServletRequest request)
  {
    super.reset(mapping, request);
    
    if (isFormToBeResetted())
    {
      setCodRisorsaForm("");
      setDescrForm("");
      setOrderBy("codRisorsa");
      setOrderDir("asc");
      setFormToBeResetted(false);
    }
  }
  
  public String getCodRisorsaForm() {
    return codRisorsaForm;
  }
  
  public void setCodRisorsaForm(String codRisorsaForm) {
    this.codRisorsaForm = codRisorsaForm;
  }
  
  public void setDescrForm(String descrForm) {
    this.descrForm = descrForm;
  }
  
  public String getDescrForm() {
    return descrForm;
  }
}