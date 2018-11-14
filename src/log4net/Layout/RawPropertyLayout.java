package log4net.Layout;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import log4net.Layout.*;
import log4net.Core.*;
import jio.System.*;public class RawPropertyLayout implements IRawLayout {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setKey (java.lang.String value){ try { javonetHandle.set("Key",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getKey (){ try { return  (java.lang.String) javonetHandle.get("Key");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }public RawPropertyLayout (){ try {  javonetHandle = Javonet.New("RawPropertyLayout");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public RawPropertyLayout(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public NObject Format (LoggingEvent loggingEvent){ try { return  (NObject) javonetHandle.invoke("Format",loggingEvent);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}