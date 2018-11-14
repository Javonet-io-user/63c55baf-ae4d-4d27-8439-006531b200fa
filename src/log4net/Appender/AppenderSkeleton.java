package log4net.Appender;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import log4net.Appender.*;
import log4net.Core.*;
import log4net.Filter.*;
import log4net.Layout.*;public abstract class AppenderSkeleton implements IBulkAppender,IAppender,IOptionHandler {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setThreshold (Level value){ try { javonetHandle.set("Threshold",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public Level getThreshold (){ try { return new Level((NObject)javonetHandle.get("Threshold"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setErrorHandler (IErrorHandler value){ try { javonetHandle.set("ErrorHandler",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public IErrorHandler getErrorHandler (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.get("ErrorHandler"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public IFilter getFilterHead (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.get("FilterHead"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setLayout (ILayout value){ try { javonetHandle.set("Layout",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public ILayout getLayout (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.get("Layout"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setName (java.lang.String value){ try { javonetHandle.set("Name",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getName (){ try { return  (java.lang.String) javonetHandle.get("Name");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }public AppenderSkeleton(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public void DoAppend (LoggingEvent[] loggingEvents){ try { javonetHandle.invoke("DoAppend",new Object[] {loggingEvents});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void Close (){ try { javonetHandle.invoke("Close");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void DoAppend (LoggingEvent loggingEvent){ try { javonetHandle.invoke("DoAppend",loggingEvent);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void ActivateOptions (){ try { javonetHandle.invoke("ActivateOptions");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void AddFilter (IFilter filter){ try { javonetHandle.invoke("AddFilter",filter);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void ClearFilters (){ try { javonetHandle.invoke("ClearFilters");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}