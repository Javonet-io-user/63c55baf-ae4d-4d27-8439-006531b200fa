package log4net.Filter;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import log4net.Filter.*;
import log4net.Core.*;public abstract class FilterSkeleton implements IFilter,IOptionHandler {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setNext (IFilter value){ try { javonetHandle.set("Next",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public IFilter getNext (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.get("Next"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public FilterSkeleton(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
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