package log4net.Core;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import log4net.Core.*;
import jio.System.*;public class Level implements IComparable {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public java.lang.String getName (){ try { return  (java.lang.String) javonetHandle.get("Name");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public java.lang.Integer getValue (){ try { return javonetHandle.get("Value");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * GetProperty
	 */
            public java.lang.String getDisplayName (){ try { return  (java.lang.String) javonetHandle.get("DisplayName");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetFiled
	 */
            public static Level getOff (){ try { return new Level((NObject)Javonet.getType("Level").get("Off"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public static void setOff (Level param){ try { Javonet.getType("Level").set("Off",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public static Level getEmergency (){ try { return new Level((NObject)Javonet.getType("Level").get("Emergency"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public static void setEmergency (Level param){ try { Javonet.getType("Level").set("Emergency",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public static Level getFatal (){ try { return new Level((NObject)Javonet.getType("Level").get("Fatal"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public static void setFatal (Level param){ try { Javonet.getType("Level").set("Fatal",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public static Level getAlert (){ try { return new Level((NObject)Javonet.getType("Level").get("Alert"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public static void setAlert (Level param){ try { Javonet.getType("Level").set("Alert",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public static Level getCritical (){ try { return new Level((NObject)Javonet.getType("Level").get("Critical"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public static void setCritical (Level param){ try { Javonet.getType("Level").set("Critical",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public static Level getSevere (){ try { return new Level((NObject)Javonet.getType("Level").get("Severe"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public static void setSevere (Level param){ try { Javonet.getType("Level").set("Severe",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public static Level getError (){ try { return new Level((NObject)Javonet.getType("Level").get("Error"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public static void setError (Level param){ try { Javonet.getType("Level").set("Error",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public static Level getWarn (){ try { return new Level((NObject)Javonet.getType("Level").get("Warn"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public static void setWarn (Level param){ try { Javonet.getType("Level").set("Warn",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public static Level getNotice (){ try { return new Level((NObject)Javonet.getType("Level").get("Notice"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public static void setNotice (Level param){ try { Javonet.getType("Level").set("Notice",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public static Level getInfo (){ try { return new Level((NObject)Javonet.getType("Level").get("Info"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public static void setInfo (Level param){ try { Javonet.getType("Level").set("Info",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public static Level getDebug (){ try { return new Level((NObject)Javonet.getType("Level").get("Debug"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public static void setDebug (Level param){ try { Javonet.getType("Level").set("Debug",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public static Level getFine (){ try { return new Level((NObject)Javonet.getType("Level").get("Fine"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public static void setFine (Level param){ try { Javonet.getType("Level").set("Fine",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public static Level getTrace (){ try { return new Level((NObject)Javonet.getType("Level").get("Trace"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public static void setTrace (Level param){ try { Javonet.getType("Level").set("Trace",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public static Level getFiner (){ try { return new Level((NObject)Javonet.getType("Level").get("Finer"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public static void setFiner (Level param){ try { Javonet.getType("Level").set("Finer",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public static Level getVerbose (){ try { return new Level((NObject)Javonet.getType("Level").get("Verbose"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public static void setVerbose (Level param){ try { Javonet.getType("Level").set("Verbose",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public static Level getFinest (){ try { return new Level((NObject)Javonet.getType("Level").get("Finest"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public static void setFinest (Level param){ try { Javonet.getType("Level").set("Finest",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public static Level getAll (){ try { return new Level((NObject)Javonet.getType("Level").get("All"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public static void setAll (Level param){ try { Javonet.getType("Level").set("All",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public Level (java.lang.Integer level,java.lang.String levelName,java.lang.String displayName){ try {  javonetHandle = Javonet.New("Level",level,levelName,displayName);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public Level (java.lang.Integer level,java.lang.String levelName){ try {  javonetHandle = Javonet.New("Level",level,levelName);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public Level(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public java.lang.Integer CompareTo (NObject r){ try { return javonetHandle.invoke("CompareTo",r);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public java.lang.String ToString (){ try { return  (java.lang.String) javonetHandle.invoke("ToString");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * Method
	 */
            public java.lang.Boolean Equals (NObject o){ try { return javonetHandle.invoke("Equals",o);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * Method
	 */
            public java.lang.Integer GetHashCode (){ try { return javonetHandle.invoke("GetHashCode");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public static java.lang.Integer Compare (Level l,Level r){ try { return Javonet.getType("Level").invoke("Compare",l,r);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}