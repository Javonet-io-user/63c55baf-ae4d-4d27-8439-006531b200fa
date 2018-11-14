package log4net.Core;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import log4net.Core.*;
import jio.System.*;
import jio.System.Collections.*;public class LevelCollection implements IList,ICollection,IEnumerable,ICloneable {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public java.lang.Integer getCount (){ try { return javonetHandle.get("Count");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * GetProperty
	 */
            public java.lang.Boolean getIsSynchronized (){ try { return javonetHandle.get("IsSynchronized");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * GetProperty
	 */
            public NObject getSyncRoot (){ try { return  (NObject) javonetHandle.get("SyncRoot");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void set_Item (java.lang.Integer index,Level value){ try { javonetHandle.invoke("set_Item",index,value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public Level get_Item (java.lang.Integer index){ try { return new Level((NObject)javonetHandle.invoke("get_Item",index));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public java.lang.Boolean getIsFixedSize (){ try { return javonetHandle.get("IsFixedSize");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * GetProperty
	 */
            public java.lang.Boolean getIsReadOnly (){ try { return javonetHandle.get("IsReadOnly");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * SetProperty
	 */
            public void setCapacity (java.lang.Integer value){ try { javonetHandle.set("Capacity",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Integer getCapacity (){ try { return javonetHandle.get("Capacity");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }public LevelCollection (){ try {  javonetHandle = Javonet.New("LevelCollection");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public LevelCollection (java.lang.Integer capacity){ try {  javonetHandle = Javonet.New("LevelCollection",capacity);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public LevelCollection (LevelCollection c){ try {  javonetHandle = Javonet.New("LevelCollection",c);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public LevelCollection (Level[] a){ try {  javonetHandle = Javonet.New("LevelCollection",new Object[] {a});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public LevelCollection (ICollection col){ try {  javonetHandle = Javonet.New("LevelCollection",col);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public LevelCollection(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
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
            public static LevelCollection ReadOnly (LevelCollection list){ try { return new LevelCollection((NObject)Javonet.getType("LevelCollection").invoke("ReadOnly",list));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public void CopyTo (Level[] array){ try { javonetHandle.invoke("CopyTo",new Object[] {array});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void CopyTo (Level[] array,java.lang.Integer start){ try { javonetHandle.invoke("CopyTo",new Object[] {array},start);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public java.lang.Integer Add (Level item){ try { return javonetHandle.invoke("Add",item);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public java.lang.Boolean Contains (Level item){ try { return javonetHandle.invoke("Contains",item);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * Method
	 */
            public java.lang.Integer IndexOf (Level item){ try { return javonetHandle.invoke("IndexOf",item);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public void Insert (java.lang.Integer index,Level item){ try { javonetHandle.invoke("Insert",index,item);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void Remove (Level item){ try { javonetHandle.invoke("Remove",item);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public java.lang.Object GetEnumerator (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.invoke("GetEnumerator"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public java.lang.Object RemoveAt (java.lang.Integer pos){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.invoke("RemoveAt",pos));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public java.lang.Integer AddRange (LevelCollection x){ try { return javonetHandle.invoke("AddRange",x);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public java.lang.Integer AddRange (Level[] x){ try { return javonetHandle.invoke("AddRange",new Object[] {x});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public java.lang.Integer AddRange (ICollection col){ try { return javonetHandle.invoke("AddRange",col);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public void TrimToSize (){ try { javonetHandle.invoke("TrimToSize");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public NObject get_Item (java.lang.Integer i){ try { return  (NObject) javonetHandle.invoke("get_Item",i);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public void set_Item (java.lang.Integer i,NObject value){ try { javonetHandle.invoke("set_Item",i,value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public java.lang.Integer Add (NObject x){ try { return javonetHandle.invoke("Add",x);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public java.lang.Boolean Contains (NObject x){ try { return javonetHandle.invoke("Contains",x);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * Method
	 */
            public java.lang.Integer IndexOf (NObject x){ try { return javonetHandle.invoke("IndexOf",x);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public void Insert (java.lang.Integer pos,NObject x){ try { javonetHandle.invoke("Insert",pos,x);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void Remove (NObject x){ try { javonetHandle.invoke("Remove",x);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void CopyTo (java.lang.reflect.Array array,java.lang.Integer start){ try { javonetHandle.invoke("CopyTo",array,start);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public static abstract class ILevelCollectionEnumerator {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public Level getCurrent (){ try { return new Level((NObject)javonetHandle.get("Current"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public ILevelCollectionEnumerator(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public java.lang.Boolean MoveNext (){ try { return javonetHandle.invoke("MoveNext");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * Method
	 */
            public void Reset (){ try { javonetHandle.invoke("Reset");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }}	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}