package log4net.Config;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import log4net.Config.*;
import jio.System.Reflection.*;
import log4net.Repository.*;
import jio.System.*;public class SecurityContextProviderAttribute extends ConfiguratorAttribute {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setProviderType (Class value){ try { javonetHandle.set("ProviderType",Javonet.getType(getReturnObjectName(value).getTypeName()));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public Class getProviderType (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.get("ProviderType"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public SecurityContextProviderAttribute (Class providerType){  super((NObject) null); try {  javonetHandle = Javonet.New("SecurityContextProviderAttribute",Javonet.getType(getReturnObjectName(providerType).getTypeName())); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public SecurityContextProviderAttribute(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
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