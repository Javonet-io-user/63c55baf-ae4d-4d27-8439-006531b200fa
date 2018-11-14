package jio.System.Collections;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import jio.System.Collections.*;
import jio.System.*;
import jio.System.Runtime.Serialization.*;public class Hashtable implements IDictionary,ICollection,IEnumerable,ISerializable,IDeserializationCallback,ICloneable {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void set_Item (NObject key,NObject value){ try { javonetHandle.invoke("set_Item",key,value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public NObject get_Item (NObject key){ try { return  (NObject) javonetHandle.invoke("get_Item",key);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public java.lang.Boolean getIsReadOnly (){ try { return javonetHandle.get("IsReadOnly");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * GetProperty
	 */
            public java.lang.Boolean getIsFixedSize (){ try { return javonetHandle.get("IsFixedSize");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * GetProperty
	 */
            public java.lang.Boolean getIsSynchronized (){ try { return javonetHandle.get("IsSynchronized");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * GetProperty
	 */
            public ICollection getKeys (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.get("Keys"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public ICollection getValues (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.get("Values"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public NObject getSyncRoot (){ try { return  (NObject) javonetHandle.get("SyncRoot");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public java.lang.Integer getCount (){ try { return javonetHandle.get("Count");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }public Hashtable (){ try {  javonetHandle = Javonet.New("Hashtable");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public Hashtable (java.lang.Integer capacity){ try {  javonetHandle = Javonet.New("Hashtable",capacity);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public Hashtable (java.lang.Integer capacity,java.lang.Float loadFactor){ try {  javonetHandle = Javonet.New("Hashtable",capacity,loadFactor);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public Hashtable (java.lang.Integer capacity,java.lang.Float loadFactor,IHashCodeProvider hcp,IComparer comparer){ try {  javonetHandle = Javonet.New("Hashtable",capacity,loadFactor,hcp,comparer);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public Hashtable (java.lang.Integer capacity,java.lang.Float loadFactor,IEqualityComparer equalityComparer){ try {  javonetHandle = Javonet.New("Hashtable",capacity,loadFactor,equalityComparer);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public Hashtable (IHashCodeProvider hcp,IComparer comparer){ try {  javonetHandle = Javonet.New("Hashtable",hcp,comparer);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public Hashtable (IEqualityComparer equalityComparer){ try {  javonetHandle = Javonet.New("Hashtable",equalityComparer);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public Hashtable (java.lang.Integer capacity,IHashCodeProvider hcp,IComparer comparer){ try {  javonetHandle = Javonet.New("Hashtable",capacity,hcp,comparer);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public Hashtable (java.lang.Integer capacity,IEqualityComparer equalityComparer){ try {  javonetHandle = Javonet.New("Hashtable",capacity,equalityComparer);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public Hashtable (IDictionary d){ try {  javonetHandle = Javonet.New("Hashtable",d);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public Hashtable (IDictionary d,java.lang.Float loadFactor){ try {  javonetHandle = Javonet.New("Hashtable",d,loadFactor);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public Hashtable (IDictionary d,IHashCodeProvider hcp,IComparer comparer){ try {  javonetHandle = Javonet.New("Hashtable",d,hcp,comparer);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public Hashtable (IDictionary d,IEqualityComparer equalityComparer){ try {  javonetHandle = Javonet.New("Hashtable",d,equalityComparer);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public Hashtable (IDictionary d,java.lang.Float loadFactor,IHashCodeProvider hcp,IComparer comparer){ try {  javonetHandle = Javonet.New("Hashtable",d,loadFactor,hcp,comparer);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public Hashtable (IDictionary d,java.lang.Float loadFactor,IEqualityComparer equalityComparer){ try {  javonetHandle = Javonet.New("Hashtable",d,loadFactor,equalityComparer);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public Hashtable(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public void Add (NObject key,NObject value){ try { javonetHandle.invoke("Add",key,value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void Clear (){ try { javonetHandle.invoke("Clear");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public NObject Clone (){ try { return  (NObject) javonetHandle.invoke("Clone");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public java.lang.Boolean Contains (NObject key){ try { return javonetHandle.invoke("Contains",key);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * Method
	 */
            public java.lang.Boolean ContainsKey (NObject key){ try { return javonetHandle.invoke("ContainsKey",key);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * Method
	 */
            public java.lang.Boolean ContainsValue (NObject value){ try { return javonetHandle.invoke("ContainsValue",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * Method
	 */
            public void CopyTo (java.lang.reflect.Array array,java.lang.Integer arrayIndex){ try { javonetHandle.invoke("CopyTo",array,arrayIndex);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public java.lang.Object GetEnumerator (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.invoke("GetEnumerator"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public void Remove (NObject key){ try { javonetHandle.invoke("Remove",key);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public static Hashtable Synchronized (Hashtable table){ try { return new Hashtable((NObject)Javonet.getType("Hashtable").invoke("Synchronized",table));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public void GetObjectData (SerializationInfo info,StreamingContext context){ try { javonetHandle.invoke("GetObjectData",info,context);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void OnDeserialization (NObject sender){ try { javonetHandle.invoke("OnDeserialization",sender);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}