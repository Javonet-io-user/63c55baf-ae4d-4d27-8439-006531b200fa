package log4net.Core;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import log4net.Core.*;public class LevelMap {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public Level get_Item (java.lang.String name){ try { return new Level((NObject)javonetHandle.invoke("get_Item",name));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public LevelCollection getAllLevels (){ try { return new LevelCollection((NObject)javonetHandle.get("AllLevels"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public LevelMap (){ try {  javonetHandle = Javonet.New("LevelMap");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public LevelMap(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public void Clear (){ try { javonetHandle.invoke("Clear");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void Add (java.lang.String name,java.lang.Integer value){ try { javonetHandle.invoke("Add",name,value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void Add (java.lang.String name,java.lang.Integer value,java.lang.String displayName){ try { javonetHandle.invoke("Add",name,value,displayName);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void Add (Level level){ try { javonetHandle.invoke("Add",level);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public Level LookupWithDefault (Level defaultLevel){ try { return new Level((NObject)javonetHandle.invoke("LookupWithDefault",defaultLevel));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}