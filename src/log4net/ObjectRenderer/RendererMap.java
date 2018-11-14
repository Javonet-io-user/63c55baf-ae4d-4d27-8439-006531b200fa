package log4net.ObjectRenderer;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import log4net.ObjectRenderer.*;
import jio.System.*;
import jio.System.IO.*;public class RendererMap {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public IObjectRenderer getDefaultRenderer (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.get("DefaultRenderer"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public RendererMap (){ try {  javonetHandle = Javonet.New("RendererMap");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public RendererMap(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public java.lang.String FindAndRender (NObject obj){ try { return  (java.lang.String) javonetHandle.invoke("FindAndRender",obj);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * Method
	 */
            public void FindAndRender (NObject obj,TextWriter writer){ try { javonetHandle.invoke("FindAndRender",obj,writer);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public IObjectRenderer Get (NObject obj){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.invoke("Get",obj));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public IObjectRenderer Get (Class type){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.invoke("Get",Javonet.getType(getReturnObjectName(type).getTypeName())));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public void Clear (){ try { javonetHandle.invoke("Clear");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void Put (Class typeToRender,IObjectRenderer renderer){ try { javonetHandle.invoke("Put",Javonet.getType(getReturnObjectName(typeToRender).getTypeName()),renderer);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}