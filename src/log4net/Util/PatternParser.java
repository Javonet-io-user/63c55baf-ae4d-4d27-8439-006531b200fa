package log4net.Util;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import log4net.Util.*;
import jio.System.Collections.*;public class PatternParser {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public Hashtable getPatternConverters (){ try { return new Hashtable((NObject)javonetHandle.get("PatternConverters"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public PatternParser (java.lang.String pattern){ try {  javonetHandle = Javonet.New("PatternParser",pattern);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public PatternParser(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public PatternConverter Parse (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.invoke("Parse"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}