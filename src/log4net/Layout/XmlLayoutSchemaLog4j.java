package log4net.Layout;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import log4net.Layout.*;public class XmlLayoutSchemaLog4j extends XmlLayoutBase {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setVersion (java.lang.String value){ try { javonetHandle.set("Version",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getVersion (){ try { return  (java.lang.String) javonetHandle.get("Version");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }public XmlLayoutSchemaLog4j (){  super((NObject) null); try {  javonetHandle = Javonet.New("XmlLayoutSchemaLog4j"); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public XmlLayoutSchemaLog4j (java.lang.Boolean locationInfo){  super((NObject) null); try {  javonetHandle = Javonet.New("XmlLayoutSchemaLog4j",locationInfo); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public XmlLayoutSchemaLog4j(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}