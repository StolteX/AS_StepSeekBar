
package com.stoltex.ASStepSeekBar;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class b4i_b4xmainpage {
    public static RemoteObject myClass;
	public b4i_b4xmainpage() {
	}
    public static PCBA staticBA = new PCBA(null, b4i_b4xmainpage.class);

public static RemoteObject __c = RemoteObject.declareNull("B4ICommon");
public static RemoteObject _root = RemoteObject.declareNull("B4XViewWrapper");
public static RemoteObject _xui = RemoteObject.declareNull("B4IXUI");
public static RemoteObject _asstepseekbar1 = RemoteObject.declareNull("b4i_asstepseekbar");
public static RemoteObject _asstepseekbar2 = RemoteObject.declareNull("b4i_asstepseekbar");
public static b4i_main _main = null;
public static b4i_b4xpages _b4xpages = null;
public static b4i_b4xcollections _b4xcollections = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"ASStepSeekBar1",_ref.getField(false, "_asstepseekbar1"),"ASStepSeekBar2",_ref.getField(false, "_asstepseekbar2"),"Root",_ref.getField(false, "_root"),"xui",_ref.getField(false, "_xui")};
}
}