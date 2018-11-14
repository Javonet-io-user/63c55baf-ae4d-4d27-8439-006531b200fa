package log4net.Filter;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import log4net.Filter.*;
import log4net.Core.*;public class StringMatchFilter extends FilterSkeleton implements IFilter,IOptionHandler {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setAcceptOnMatch (java.lang.Boolean value){ try { javonetHandle.set("AcceptOnMatch",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Boolean getAcceptOnMatch (){ try { return javonetHandle.get("AcceptOnMatch");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * SetProperty
	 */
            public void setStringToMatch (java.lang.String value){ try { javonetHandle.set("StringToMatch",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getStringToMatch (){ try { return  (java.lang.String) javonetHandle.get("StringToMatch");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setRegexToMatch (java.lang.String value){ try { javonetHandle.set("RegexToMatch",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getRegexToMatch (){ try { return  (java.lang.String) javonetHandle.get("RegexToMatch");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }public StringMatchFilter (){  super((NObject) null); try {  javonetHandle = Javonet.New("StringMatchFilter"); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public StringMatchFilter(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public FilterDecision Decide (LoggingEvent loggingEvent){ try { return FilterDecision.valueOf(((NEnum) javonetHandle.invoke("Decide",loggingEvent)).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public void ActivateOptions (){ try { javonetHandle.invoke("ActivateOptions");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}