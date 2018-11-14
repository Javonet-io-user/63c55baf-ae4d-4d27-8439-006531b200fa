package log4net.Appender;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import log4net.Appender.*;
import jio.System.*;
import jio.System.Collections.*;public class AppenderCollection implements IList,ICollection,IEnumerable,ICloneable {protected NObject javonetHandle; /**
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
            public void set_Item (java.lang.Integer index,IAppender value){ try { javonetHandle.invoke("set_Item",index,value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public IAppender get_Item (java.lang.Integer index){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.invoke("get_Item",index));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
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
            public java.lang.Integer getCapacity (){ try { return javonetHandle.get("Capacity");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * GetFiled
	 */
            public static AppenderCollection getEmptyCollection (){ try { return new AppenderCollection((NObject)Javonet.getType("AppenderCollection").get("EmptyCollection"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public static void setEmptyCollection (AppenderCollection param){ try { Javonet.getType("AppenderCollection").set("EmptyCollection",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public AppenderCollection (){ try {  javonetHandle = Javonet.New("AppenderCollection");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public AppenderCollection (java.lang.Integer capacity){ try {  javonetHandle = Javonet.New("AppenderCollection",capacity);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public AppenderCollection (AppenderCollection c){ try {  javonetHandle = Javonet.New("AppenderCollection",c);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public AppenderCollection (IAppender[] a){ try {  javonetHandle = Javonet.New("AppenderCollection",new Object[] {a});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public AppenderCollection (ICollection col){ try {  javonetHandle = Javonet.New("AppenderCollection",col);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public AppenderCollection(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
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
            public static AppenderCollection ReadOnly (AppenderCollection list){ try { return new AppenderCollection((NObject)Javonet.getType("AppenderCollection").invoke("ReadOnly",list));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public void CopyTo (IAppender[] array){ try { javonetHandle.invoke("CopyTo",new Object[] {array});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void CopyTo (IAppender[] array,java.lang.Integer start){ try { javonetHandle.invoke("CopyTo",new Object[] {array},start);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public java.lang.Integer Add (IAppender item){ try { return javonetHandle.invoke("Add",item);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public java.lang.Boolean Contains (IAppender item){ try { return javonetHandle.invoke("Contains",item);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * Method
	 */
            public java.lang.Integer IndexOf (IAppender item){ try { return javonetHandle.invoke("IndexOf",item);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public void Insert (java.lang.Integer index,IAppender item){ try { javonetHandle.invoke("Insert",index,item);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void Remove (IAppender item){ try { javonetHandle.invoke("Remove",item);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public java.lang.Object GetEnumerator (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.invoke("GetEnumerator"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public java.lang.Object RemoveAt (java.lang.Integer pos){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.invoke("RemoveAt",pos));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public java.lang.Integer AddRange (AppenderCollection x){ try { return javonetHandle.invoke("AddRange",x);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public java.lang.Integer AddRange (IAppender[] x){ try { return javonetHandle.invoke("AddRange",new Object[] {x});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public java.lang.Integer AddRange (ICollection col){ try { return javonetHandle.invoke("AddRange",col);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public void TrimToSize (){ try { javonetHandle.invoke("TrimToSize");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public IAppender[] ToArray (){ try { return Helper.ConvertNObjectToDestinationType((NObject[])javonetHandle.invoke("ToArray"),IAppender[].class);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
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
            public void CopyTo (java.lang.reflect.Array array,java.lang.Integer start){ try { javonetHandle.invoke("CopyTo",array,start);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public static abstract class IAppenderCollectionEnumerator {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public IAppender getCurrent (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.get("Current"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public IAppenderCollectionEnumerator(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
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