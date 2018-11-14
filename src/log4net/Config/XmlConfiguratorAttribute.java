package log4net.Config;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import log4net.Config.*;
import jio.System.Reflection.*;
import log4net.Repository.*;public class XmlConfiguratorAttribute extends ConfiguratorAttribute {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setConfigFile (java.lang.String value){ try { javonetHandle.set("ConfigFile",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getConfigFile (){ try { return  (java.lang.String) javonetHandle.get("ConfigFile");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setConfigFileExtension (java.lang.String value){ try { javonetHandle.set("ConfigFileExtension",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getConfigFileExtension (){ try { return  (java.lang.String) javonetHandle.get("ConfigFileExtension");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setWatch (java.lang.Boolean value){ try { javonetHandle.set("Watch",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Boolean getWatch (){ try { return javonetHandle.get("Watch");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }public XmlConfiguratorAttribute (){  super((NObject) null); try {  javonetHandle = Javonet.New("XmlConfiguratorAttribute"); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public XmlConfiguratorAttribute(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public void Configure (Assembly sourceAssembly,ILoggerRepository targetRepository){ try { javonetHandle.invoke("Configure",sourceAssembly,targetRepository);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}