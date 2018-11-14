package log4net.Layout;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import log4net.Layout.*;
import jio.System.IO.*;
import log4net.Core.*;public abstract class XmlLayoutBase extends LayoutSkeleton implements ILayout,IOptionHandler {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setLocationInfo (java.lang.Boolean value){ try { javonetHandle.set("LocationInfo",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Boolean getLocationInfo (){ try { return javonetHandle.get("LocationInfo");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * SetProperty
	 */
            public void setInvalidCharReplacement (java.lang.String value){ try { javonetHandle.set("InvalidCharReplacement",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getInvalidCharReplacement (){ try { return  (java.lang.String) javonetHandle.get("InvalidCharReplacement");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public java.lang.String getXmlLayoutBaseXmlLayoutBaseContentType (){ try { return  (java.lang.String) javonetHandle.get("XmlLayoutBaseXmlLayoutBaseContentType");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }public XmlLayoutBase(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public void Format (TextWriter writer,LoggingEvent loggingEvent){ try { javonetHandle.invoke("Format",writer,loggingEvent);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void ActivateOptions (){ try { javonetHandle.invoke("ActivateOptions");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}