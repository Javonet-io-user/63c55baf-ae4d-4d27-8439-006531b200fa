package log4net.Config;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import jio.System.*;
import log4net.Config.*;public class AliasRepositoryAttribute extends Attribute {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setName (java.lang.String value){ try { javonetHandle.set("Name",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getName (){ try { return  (java.lang.String) javonetHandle.get("Name");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }public AliasRepositoryAttribute (java.lang.String name){  super((NObject) null); try {  javonetHandle = Javonet.New("AliasRepositoryAttribute",name); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public AliasRepositoryAttribute(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}