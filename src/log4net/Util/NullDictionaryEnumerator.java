package log4net.Util;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import log4net.Util.*;
import jio.System.*;
import jio.System.Collections.*;public class NullDictionaryEnumerator implements IDictionaryEnumerator,IEnumerator {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public static NullDictionaryEnumerator getInstance (){ try { return new NullDictionaryEnumerator((NObject)Javonet.getType("NullDictionaryEnumerator").get("Instance"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public NObject getCurrent (){ try { return  (NObject) javonetHandle.get("Current");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public NObject getKey (){ try { return  (NObject) javonetHandle.get("Key");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public NObject getValue (){ try { return  (NObject) javonetHandle.get("Value");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public DictionaryEntry getEntry (){ try { return javonetHandle.get("Entry");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public NullDictionaryEnumerator(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public java.lang.Boolean MoveNext (){ try { return javonetHandle.invoke("MoveNext");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * Method
	 */
            public void Reset (){ try { javonetHandle.invoke("Reset");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}