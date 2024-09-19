
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class asstepseekbar {
    public static RemoteObject myClass;
	public asstepseekbar() {
	}
    public static PCBA staticBA = new PCBA(null, asstepseekbar.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _meventname = RemoteObject.createImmutable("");
public static RemoteObject _mcallback = RemoteObject.declareNull("Object");
public static RemoteObject _mbase = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _reachedlinecolor = RemoteObject.createImmutable(0);
public static RemoteObject _unreachedlinecolor = RemoteObject.createImmutable(0);
public static RemoteObject _thumbcolor = RemoteObject.createImmutable(0);
public static RemoteObject _cvs = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas");
public static RemoteObject _tag = RemoteObject.declareNull("Object");
public static RemoteObject _touchpanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _mvalue = RemoteObject.createImmutable(0);
public static RemoteObject _minvalue = RemoteObject.createImmutable(0);
public static RemoteObject _maxvalue = RemoteObject.createImmutable(0);
public static RemoteObject _interval = RemoteObject.createImmutable(0);
public static RemoteObject _vertical = RemoteObject.createImmutable(false);
public static RemoteObject _reachedlinesize = RemoteObject.createImmutable(0);
public static RemoteObject _unreachedlinesize = RemoteObject.createImmutable(0);
public static RemoteObject _radius1 = RemoteObject.createImmutable(0);
public static RemoteObject _radius2 = RemoteObject.createImmutable(0);
public static RemoteObject _pressed = RemoteObject.createImmutable(false);
public static RemoteObject _size = RemoteObject.createImmutable(0);
public static RemoteObject _lst_sections = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _lst_x = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _lst_y = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _m_index = RemoteObject.createImmutable(0);
public static b4j.example.main _main = null;
public static b4j.example.b4xpages _b4xpages = null;
public static b4j.example.b4xcollections _b4xcollections = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"cvs",_ref.getField(false, "_cvs"),"Interval",_ref.getField(false, "_interval"),"lst_Sections",_ref.getField(false, "_lst_sections"),"lst_X",_ref.getField(false, "_lst_x"),"lst_Y",_ref.getField(false, "_lst_y"),"m_Index",_ref.getField(false, "_m_index"),"MaxValue",_ref.getField(false, "_maxvalue"),"mBase",_ref.getField(false, "_mbase"),"mCallBack",_ref.getField(false, "_mcallback"),"mEventName",_ref.getField(false, "_meventname"),"MinValue",_ref.getField(false, "_minvalue"),"mValue",_ref.getField(false, "_mvalue"),"Pressed",_ref.getField(false, "_pressed"),"Radius1",_ref.getField(false, "_radius1"),"Radius2",_ref.getField(false, "_radius2"),"ReachedLineColor",_ref.getField(false, "_reachedlinecolor"),"ReachedLineSize",_ref.getField(false, "_reachedlinesize"),"size",_ref.getField(false, "_size"),"Tag",_ref.getField(false, "_tag"),"ThumbColor",_ref.getField(false, "_thumbcolor"),"TouchPanel",_ref.getField(false, "_touchpanel"),"UnreachedLineColor",_ref.getField(false, "_unreachedlinecolor"),"UnreachedLineSize",_ref.getField(false, "_unreachedlinesize"),"Vertical",_ref.getField(false, "_vertical"),"xui",_ref.getField(false, "_xui")};
}
}