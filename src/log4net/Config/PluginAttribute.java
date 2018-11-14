package log4net.Config;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import jio.System.*;
import log4net.Config.*;
import log4net.Plugin.*;public class PluginAttribute extends Attribute implements IPluginFactory {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setType (Class value){ try { javonetHandle.set("Type",Javonet.getType(getReturnObjectName(value).getTypeName()));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public Class getType (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.get("Type"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setTypeName (java.lang.String value){ try { javonetHandle.set("TypeName",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getTypeName (){ try { return  (java.lang.String) javonetHandle.get("TypeName");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }public PluginAttribute (java.lang.String typeName){  super((NObject) null); try {  javonetHandle = Javonet.New("PluginAttribute",typeName); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public PluginAttribute (Class type){  super((NObject) null); try {  javonetHandle = Javonet.New("PluginAttribute",Javonet.getType(getReturnObjectName(type).getTypeName())); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public PluginAttribute(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public IPlugin CreatePlugin (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.invoke("CreatePlugin"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public java.lang.String ToString (){ try { return  (java.lang.String) javonetHandle.invoke("ToString");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}