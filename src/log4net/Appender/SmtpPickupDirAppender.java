package log4net.Appender;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import log4net.Appender.*;
import log4net.Core.*;public class SmtpPickupDirAppender extends BufferingAppenderSkeleton implements IOptionHandler {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setTo (java.lang.String value){ try { javonetHandle.set("To",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getTo (){ try { return  (java.lang.String) javonetHandle.get("To");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setFrom (java.lang.String value){ try { javonetHandle.set("From",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getFrom (){ try { return  (java.lang.String) javonetHandle.get("From");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setSubject (java.lang.String value){ try { javonetHandle.set("Subject",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getSubject (){ try { return  (java.lang.String) javonetHandle.get("Subject");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setPickupDir (java.lang.String value){ try { javonetHandle.set("PickupDir",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getPickupDir (){ try { return  (java.lang.String) javonetHandle.get("PickupDir");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setSecurityContext (SecurityContext value){ try { javonetHandle.set("SecurityContext",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public SecurityContext getSecurityContext (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.get("SecurityContext"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public SmtpPickupDirAppender (){  super((NObject) null); try {  javonetHandle = Javonet.New("SmtpPickupDirAppender"); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public SmtpPickupDirAppender(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public void ActivateOptions (){ try { javonetHandle.invoke("ActivateOptions");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}