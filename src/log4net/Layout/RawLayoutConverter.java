package log4net.Layout;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import log4net.Layout.*;
import jio.System.*;
import log4net.Util.TypeConverters.*;public class RawLayoutConverter implements IConvertFrom {protected NObject javonetHandle; public RawLayoutConverter (){ try {  javonetHandle = Javonet.New("RawLayoutConverter");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public RawLayoutConverter(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public java.lang.Boolean CanConvertFrom (Class sourceType){ try { return javonetHandle.invoke("CanConvertFrom",Javonet.getType(getReturnObjectName(sourceType).getTypeName()));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * Method
	 */
            public NObject ConvertFrom (NObject source){ try { return  (NObject) javonetHandle.invoke("ConvertFrom",source);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}