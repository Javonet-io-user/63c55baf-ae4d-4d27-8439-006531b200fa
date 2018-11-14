package jio.System.Collections;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import jio.System.Collections.*;
import jio.System.*;public class Stack implements ICollection,IEnumerable,ICloneable {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public java.lang.Integer getCount (){ try { return javonetHandle.get("Count");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * GetProperty
	 */
            public java.lang.Boolean getIsSynchronized (){ try { return javonetHandle.get("IsSynchronized");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * GetProperty
	 */
            public NObject getSyncRoot (){ try { return  (NObject) javonetHandle.get("SyncRoot");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public Stack (){ try {  javonetHandle = Javonet.New("Stack");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public Stack (java.lang.Integer initialCapacity){ try {  javonetHandle = Javonet.New("Stack",initialCapacity);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public Stack (ICollection col){ try {  javonetHandle = Javonet.New("Stack",col);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public Stack(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public void Clear (){ try { javonetHandle.invoke("Clear");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public NObject Clone (){ try { return  (NObject) javonetHandle.invoke("Clone");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public java.lang.Boolean Contains (NObject obj){ try { return javonetHandle.invoke("Contains",obj);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * Method
	 */
            public void CopyTo (java.lang.reflect.Array array,java.lang.Integer index){ try { javonetHandle.invoke("CopyTo",array,index);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public IEnumerator GetEnumerator (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.invoke("GetEnumerator"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public NObject Peek (){ try { return  (NObject) javonetHandle.invoke("Peek");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public NObject Pop (){ try { return  (NObject) javonetHandle.invoke("Pop");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public void Push (NObject obj){ try { javonetHandle.invoke("Push",obj);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public static Stack Synchronized (Stack stack){ try { return new Stack((NObject)Javonet.getType("Stack").invoke("Synchronized",stack));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public NObject[] ToArray (){ try { return Helper.ConvertNObjectToDestinationType((NObject[])javonetHandle.invoke("ToArray"),NObject[].class);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}