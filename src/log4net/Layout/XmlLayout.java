package log4net.Layout;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import log4net.Layout.*;
import log4net.Core.*;public class XmlLayout extends XmlLayoutBase implements IOptionHandler {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setPrefix (java.lang.String value){ try { javonetHandle.set("Prefix",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getPrefix (){ try { return  (java.lang.String) javonetHandle.get("Prefix");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setBase64EncodeMessage (java.lang.Boolean value){ try { javonetHandle.set("Base64EncodeMessage",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Boolean getBase64EncodeMessage (){ try { return javonetHandle.get("Base64EncodeMessage");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * SetProperty
	 */
            public void setBase64EncodeProperties (java.lang.Boolean value){ try { javonetHandle.set("Base64EncodeProperties",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Boolean getBase64EncodeProperties (){ try { return javonetHandle.get("Base64EncodeProperties");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }public XmlLayout (){  super((NObject) null); try {  javonetHandle = Javonet.New("XmlLayout"); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public XmlLayout (java.lang.Boolean locationInfo){  super((NObject) null); try {  javonetHandle = Javonet.New("XmlLayout",locationInfo); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public XmlLayout(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
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