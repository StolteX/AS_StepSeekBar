package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class asstepseekbar extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.asstepseekbar", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.asstepseekbar.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public static class _asstepseekbar_step{
public boolean IsInitialized;
public Object Value;
public int ReachedColor;
public int UnreachedColor;
public void Initialize() {
IsInitialized = true;
Value = new Object();
ReachedColor = 0;
UnreachedColor = 0;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public anywheresoftware.b4a.keywords.Common __c = null;
public String _meventname = "";
public Object _mcallback = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _mbase = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public int _reachedlinecolor = 0;
public int _unreachedlinecolor = 0;
public int _thumbcolor = 0;
public anywheresoftware.b4a.objects.B4XCanvas _cvs = null;
public Object _tag = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _touchpanel = null;
public int _mvalue = 0;
public int _minvalue = 0;
public int _maxvalue = 0;
public int _interval = 0;
public boolean _vertical = false;
public int _reachedlinesize = 0;
public int _unreachedlinesize = 0;
public int _radius1 = 0;
public int _radius2 = 0;
public boolean _pressed = false;
public int _size = 0;
public anywheresoftware.b4a.objects.collections.List _lst_sections = null;
public anywheresoftware.b4a.objects.collections.List _lst_x = null;
public anywheresoftware.b4a.objects.collections.List _lst_y = null;
public int _m_index = 0;
public b4j.example.main _main = null;
public b4j.example.b4xpages _b4xpages = null;
public b4j.example.b4xcollections _b4xcollections = null;
public String  _addstep2(b4j.example.asstepseekbar __ref,int _reachedcolor,int _unreachedcolor,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="asstepseekbar";
if (Debug.shouldDelegate(ba, "addstep2", false))
	 {return ((String) Debug.delegate(ba, "addstep2", new Object[] {_reachedcolor,_unreachedcolor,_value}));}
RDebugUtils.currentLine=10813440;
 //BA.debugLineNum = 10813440;BA.debugLine="Public Sub AddStep2(ReachedColor As Int, Unreached";
RDebugUtils.currentLine=10813441;
 //BA.debugLineNum = 10813441;BA.debugLine="lst_Sections.Add(CreateASStepSeekBar_Step(Value,R";
__ref._lst_sections /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__ref._createasstepseekbar_step /*b4j.example.asstepseekbar._asstepseekbar_step*/ (null,_value,_reachedcolor,_unreachedcolor)));
RDebugUtils.currentLine=10813442;
 //BA.debugLineNum = 10813442;BA.debugLine="Update";
__ref._update /*String*/ (null);
RDebugUtils.currentLine=10813443;
 //BA.debugLineNum = 10813443;BA.debugLine="End Sub";
return "";
}
public String  _addstep(b4j.example.asstepseekbar __ref,int _color,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="asstepseekbar";
if (Debug.shouldDelegate(ba, "addstep", false))
	 {return ((String) Debug.delegate(ba, "addstep", new Object[] {_color,_value}));}
RDebugUtils.currentLine=1572864;
 //BA.debugLineNum = 1572864;BA.debugLine="Public Sub AddStep(Color As Int,Value As Object)";
RDebugUtils.currentLine=1572865;
 //BA.debugLineNum = 1572865;BA.debugLine="lst_Sections.Add(CreateASStepSeekBar_Step(Value,C";
__ref._lst_sections /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__ref._createasstepseekbar_step /*b4j.example.asstepseekbar._asstepseekbar_step*/ (null,_value,_color,_color)));
RDebugUtils.currentLine=1572866;
 //BA.debugLineNum = 1572866;BA.debugLine="Update";
__ref._update /*String*/ (null);
RDebugUtils.currentLine=1572867;
 //BA.debugLineNum = 1572867;BA.debugLine="End Sub";
return "";
}
public b4j.example.asstepseekbar._asstepseekbar_step  _createasstepseekbar_step(b4j.example.asstepseekbar __ref,Object _value,int _reachedcolor,int _unreachedcolor) throws Exception{
__ref = this;
RDebugUtils.currentModule="asstepseekbar";
if (Debug.shouldDelegate(ba, "createasstepseekbar_step", false))
	 {return ((b4j.example.asstepseekbar._asstepseekbar_step) Debug.delegate(ba, "createasstepseekbar_step", new Object[] {_value,_reachedcolor,_unreachedcolor}));}
b4j.example.asstepseekbar._asstepseekbar_step _t1 = null;
RDebugUtils.currentLine=1703936;
 //BA.debugLineNum = 1703936;BA.debugLine="Public Sub CreateASStepSeekBar_Step (Value As Obje";
RDebugUtils.currentLine=1703937;
 //BA.debugLineNum = 1703937;BA.debugLine="Dim t1 As ASStepSeekBar_Step";
_t1 = new b4j.example.asstepseekbar._asstepseekbar_step();
RDebugUtils.currentLine=1703938;
 //BA.debugLineNum = 1703938;BA.debugLine="t1.Initialize";
_t1.Initialize();
RDebugUtils.currentLine=1703939;
 //BA.debugLineNum = 1703939;BA.debugLine="t1.Value = Value";
_t1.Value /*Object*/  = _value;
RDebugUtils.currentLine=1703940;
 //BA.debugLineNum = 1703940;BA.debugLine="t1.ReachedColor = ReachedColor";
_t1.ReachedColor /*int*/  = _reachedcolor;
RDebugUtils.currentLine=1703941;
 //BA.debugLineNum = 1703941;BA.debugLine="t1.UnreachedColor = UnreachedColor";
_t1.UnreachedColor /*int*/  = _unreachedcolor;
RDebugUtils.currentLine=1703942;
 //BA.debugLineNum = 1703942;BA.debugLine="Return t1";
if (true) return _t1;
RDebugUtils.currentLine=1703943;
 //BA.debugLineNum = 1703943;BA.debugLine="End Sub";
return null;
}
public String  _update(b4j.example.asstepseekbar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asstepseekbar";
if (Debug.shouldDelegate(ba, "update", false))
	 {return ((String) Debug.delegate(ba, "update", null));}
int _s1 = 0;
int _y = 0;
int _i = 0;
float _tmp_width = 0f;
float _newx = 0f;
b4j.example.asstepseekbar._asstepseekbar_step _section = null;
int _x = 0;
float _tmp_height = 0f;
float _newy = 0f;
RDebugUtils.currentLine=1048576;
 //BA.debugLineNum = 1048576;BA.debugLine="Public Sub Update";
RDebugUtils.currentLine=1048577;
 //BA.debugLineNum = 1048577;BA.debugLine="size = Max(mBase.Height, mBase.Width) - 2 * Radiu";
__ref._size /*int*/  = (int) (__c.Max(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth())-2*__ref._radius2 /*int*/ );
RDebugUtils.currentLine=1048578;
 //BA.debugLineNum = 1048578;BA.debugLine="cvs.ClearRect(cvs.TargetRect)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .ClearRect(__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect());
RDebugUtils.currentLine=1048579;
 //BA.debugLineNum = 1048579;BA.debugLine="If size > 0 Then";
if (__ref._size /*int*/ >0) { 
RDebugUtils.currentLine=1048580;
 //BA.debugLineNum = 1048580;BA.debugLine="If Vertical = False Then";
if (__ref._vertical /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=1048581;
 //BA.debugLineNum = 1048581;BA.debugLine="Dim s1 As Int = Radius2 + (mValue - MinValue) /";
_s1 = (int) (__ref._radius2 /*int*/ +(__ref._mvalue /*int*/ -__ref._minvalue /*int*/ )/(double)(__ref._maxvalue /*int*/ -__ref._minvalue /*int*/ )*__ref._size /*int*/ );
RDebugUtils.currentLine=1048582;
 //BA.debugLineNum = 1048582;BA.debugLine="Dim y As Int = mBase.Height / 2";
_y = (int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)2);
RDebugUtils.currentLine=1048583;
 //BA.debugLineNum = 1048583;BA.debugLine="cvs.DrawLine(Radius2, y, s1, y, ReachedLineColo";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawLine((float) (__ref._radius2 /*int*/ ),(float) (_y),(float) (_s1),(float) (_y),__ref._reachedlinecolor /*int*/ ,(float) (__ref._reachedlinesize /*int*/ ));
RDebugUtils.currentLine=1048584;
 //BA.debugLineNum = 1048584;BA.debugLine="cvs.DrawLine(s1, y, mBase.Width - Radius2, y, U";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawLine((float) (_s1),(float) (_y),(float) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-__ref._radius2 /*int*/ ),(float) (_y),__ref._unreachedlinecolor /*int*/ ,(float) (__ref._unreachedlinesize /*int*/ ));
RDebugUtils.currentLine=1048586;
 //BA.debugLineNum = 1048586;BA.debugLine="lst_X.Clear";
__ref._lst_x /*anywheresoftware.b4a.objects.collections.List*/ .Clear();
RDebugUtils.currentLine=1048588;
 //BA.debugLineNum = 1048588;BA.debugLine="For i = 0 To lst_Sections.Size -1";
{
final int step10 = 1;
final int limit10 = (int) (__ref._lst_sections /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit10 ;_i = _i + step10 ) {
RDebugUtils.currentLine=1048590;
 //BA.debugLineNum = 1048590;BA.debugLine="Dim tmp_width As Float = (mBase.Width - Radius";
_tmp_width = (float) ((__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-__ref._radius2 /*int*/ *2));
RDebugUtils.currentLine=1048592;
 //BA.debugLineNum = 1048592;BA.debugLine="Dim newx As Float = 0";
_newx = (float) (0);
RDebugUtils.currentLine=1048593;
 //BA.debugLineNum = 1048593;BA.debugLine="If i = 0 Then";
if (_i==0) { 
RDebugUtils.currentLine=1048594;
 //BA.debugLineNum = 1048594;BA.debugLine="newx = Radius2";
_newx = (float) (__ref._radius2 /*int*/ );
 }else 
{RDebugUtils.currentLine=1048595;
 //BA.debugLineNum = 1048595;BA.debugLine="Else if i = (lst_Sections.Size -1) Then";
if (_i==(__ref._lst_sections /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1)) { 
RDebugUtils.currentLine=1048596;
 //BA.debugLineNum = 1048596;BA.debugLine="newx = tmp_width + Radius2";
_newx = (float) (_tmp_width+__ref._radius2 /*int*/ );
 }else {
RDebugUtils.currentLine=1048598;
 //BA.debugLineNum = 1048598;BA.debugLine="newx = (tmp_width/(lst_Sections.Size -1)) * i";
_newx = (float) ((_tmp_width/(double)(__ref._lst_sections /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1))*_i+__ref._radius2 /*int*/ );
 }}
;
RDebugUtils.currentLine=1048600;
 //BA.debugLineNum = 1048600;BA.debugLine="Dim Section As ASStepSeekBar_Step = lst_Sectio";
_section = (b4j.example.asstepseekbar._asstepseekbar_step)(__ref._lst_sections /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
RDebugUtils.currentLine=1048602;
 //BA.debugLineNum = 1048602;BA.debugLine="If i > m_Index Then";
if (_i>__ref._m_index /*int*/ ) { 
RDebugUtils.currentLine=1048603;
 //BA.debugLineNum = 1048603;BA.debugLine="cvs.DrawCircle(newx,mBase.Height/2,Radius1,Se";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawCircle(_newx,(float) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)2),(float) (__ref._radius1 /*int*/ ),_section.UnreachedColor /*int*/ ,__c.True,(float) (0));
 }else {
RDebugUtils.currentLine=1048605;
 //BA.debugLineNum = 1048605;BA.debugLine="cvs.DrawCircle(newx,mBase.Height/2,Radius1,Se";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawCircle(_newx,(float) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)2),(float) (__ref._radius1 /*int*/ ),_section.ReachedColor /*int*/ ,__c.True,(float) (0));
 };
RDebugUtils.currentLine=1048608;
 //BA.debugLineNum = 1048608;BA.debugLine="lst_X.Add(newx)";
__ref._lst_x /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_newx));
 }
};
RDebugUtils.currentLine=1048612;
 //BA.debugLineNum = 1048612;BA.debugLine="cvs.DrawCircle(s1, y, Radius2/2, ReachedLineCol";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawCircle((float) (_s1),(float) (_y),(float) (__ref._radius2 /*int*/ /(double)2),__ref._reachedlinecolor /*int*/ ,__c.True,(float) (0));
RDebugUtils.currentLine=1048614;
 //BA.debugLineNum = 1048614;BA.debugLine="If Pressed Then";
if (__ref._pressed /*boolean*/ ) { 
RDebugUtils.currentLine=1048615;
 //BA.debugLineNum = 1048615;BA.debugLine="cvs.DrawCircle(s1, y, Radius2, ThumbColor, Tru";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawCircle((float) (_s1),(float) (_y),(float) (__ref._radius2 /*int*/ ),__ref._thumbcolor /*int*/ ,__c.True,(float) (0));
 };
 }else {
RDebugUtils.currentLine=1048618;
 //BA.debugLineNum = 1048618;BA.debugLine="Dim s1 As Int = Radius2 + (MaxValue - mValue -";
_s1 = (int) (__ref._radius2 /*int*/ +(__ref._maxvalue /*int*/ -__ref._mvalue /*int*/ -__ref._minvalue /*int*/ )/(double)(__ref._maxvalue /*int*/ -__ref._minvalue /*int*/ )*__ref._size /*int*/ );
RDebugUtils.currentLine=1048619;
 //BA.debugLineNum = 1048619;BA.debugLine="Dim x As Int = mBase.Width / 2";
_x = (int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)2);
RDebugUtils.currentLine=1048620;
 //BA.debugLineNum = 1048620;BA.debugLine="cvs.DrawLine(x, Radius2, x, s1, UnreachedLineCo";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawLine((float) (_x),(float) (__ref._radius2 /*int*/ ),(float) (_x),(float) (_s1),__ref._unreachedlinecolor /*int*/ ,(float) (__ref._unreachedlinesize /*int*/ ));
RDebugUtils.currentLine=1048621;
 //BA.debugLineNum = 1048621;BA.debugLine="cvs.DrawLine(x, s1, x, mBase.Height - Radius2,";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawLine((float) (_x),(float) (_s1),(float) (_x),(float) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-__ref._radius2 /*int*/ ),__ref._reachedlinecolor /*int*/ ,(float) (__ref._reachedlinesize /*int*/ ));
RDebugUtils.currentLine=1048623;
 //BA.debugLineNum = 1048623;BA.debugLine="lst_Y.Clear";
__ref._lst_y /*anywheresoftware.b4a.objects.collections.List*/ .Clear();
RDebugUtils.currentLine=1048626;
 //BA.debugLineNum = 1048626;BA.debugLine="For i = 0 To lst_Sections.Size -1";
{
final int step38 = 1;
final int limit38 = (int) (__ref._lst_sections /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit38 ;_i = _i + step38 ) {
RDebugUtils.currentLine=1048628;
 //BA.debugLineNum = 1048628;BA.debugLine="Dim tmp_height As Float = (mBase.Height - Radi";
_tmp_height = (float) ((__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-__ref._radius2 /*int*/ *2));
RDebugUtils.currentLine=1048630;
 //BA.debugLineNum = 1048630;BA.debugLine="Dim newy As Float = 0";
_newy = (float) (0);
RDebugUtils.currentLine=1048631;
 //BA.debugLineNum = 1048631;BA.debugLine="If i = 0 Then";
if (_i==0) { 
RDebugUtils.currentLine=1048632;
 //BA.debugLineNum = 1048632;BA.debugLine="newy = tmp_height + Radius2";
_newy = (float) (_tmp_height+__ref._radius2 /*int*/ );
 }else 
{RDebugUtils.currentLine=1048633;
 //BA.debugLineNum = 1048633;BA.debugLine="Else if i = (lst_Sections.Size -1) Then";
if (_i==(__ref._lst_sections /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1)) { 
RDebugUtils.currentLine=1048634;
 //BA.debugLineNum = 1048634;BA.debugLine="newy = Radius2";
_newy = (float) (__ref._radius2 /*int*/ );
 }else {
RDebugUtils.currentLine=1048636;
 //BA.debugLineNum = 1048636;BA.debugLine="newy = mBase.Height - (tmp_height/(lst_Sectio";
_newy = (float) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-(_tmp_height/(double)(__ref._lst_sections /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1))*_i+__ref._radius2 /*int*/ );
 }}
;
RDebugUtils.currentLine=1048638;
 //BA.debugLineNum = 1048638;BA.debugLine="Dim Section As ASStepSeekBar_Step = lst_Sectio";
_section = (b4j.example.asstepseekbar._asstepseekbar_step)(__ref._lst_sections /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
RDebugUtils.currentLine=1048640;
 //BA.debugLineNum = 1048640;BA.debugLine="If i > m_Index Then";
if (_i>__ref._m_index /*int*/ ) { 
RDebugUtils.currentLine=1048641;
 //BA.debugLineNum = 1048641;BA.debugLine="cvs.DrawCircle(mBase.Width/2,newy,Radius1,Sec";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawCircle((float) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)2),_newy,(float) (__ref._radius1 /*int*/ ),_section.UnreachedColor /*int*/ ,__c.True,(float) (0));
 }else {
RDebugUtils.currentLine=1048643;
 //BA.debugLineNum = 1048643;BA.debugLine="cvs.DrawCircle(mBase.Width/2,newy,Radius1,Sec";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawCircle((float) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)2),_newy,(float) (__ref._radius1 /*int*/ ),_section.ReachedColor /*int*/ ,__c.True,(float) (0));
 };
RDebugUtils.currentLine=1048645;
 //BA.debugLineNum = 1048645;BA.debugLine="lst_Y.Add(newy)";
__ref._lst_y /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_newy));
 }
};
RDebugUtils.currentLine=1048649;
 //BA.debugLineNum = 1048649;BA.debugLine="cvs.DrawCircle(x, s1, Radius2/2, ReachedLineCol";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawCircle((float) (_x),(float) (_s1),(float) (__ref._radius2 /*int*/ /(double)2),__ref._reachedlinecolor /*int*/ ,__c.True,(float) (0));
RDebugUtils.currentLine=1048651;
 //BA.debugLineNum = 1048651;BA.debugLine="If Pressed Then";
if (__ref._pressed /*boolean*/ ) { 
RDebugUtils.currentLine=1048652;
 //BA.debugLineNum = 1048652;BA.debugLine="cvs.DrawCircle(x, s1, Radius2, ThumbColor, Tru";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawCircle((float) (_x),(float) (_s1),(float) (__ref._radius2 /*int*/ ),__ref._thumbcolor /*int*/ ,__c.True,(float) (0));
 };
 };
 };
RDebugUtils.currentLine=1048656;
 //BA.debugLineNum = 1048656;BA.debugLine="cvs.Invalidate";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Invalidate();
RDebugUtils.currentLine=1048657;
 //BA.debugLineNum = 1048657;BA.debugLine="End Sub";
return "";
}
public String  _base_resize(b4j.example.asstepseekbar __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="asstepseekbar";
if (Debug.shouldDelegate(ba, "base_resize", false))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=983040;
 //BA.debugLineNum = 983040;BA.debugLine="Public Sub Base_Resize (Width As Double, Height As";
RDebugUtils.currentLine=983041;
 //BA.debugLineNum = 983041;BA.debugLine="cvs.Resize(Width, Height)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Resize(_width,_height);
RDebugUtils.currentLine=983042;
 //BA.debugLineNum = 983042;BA.debugLine="TouchPanel.SetLayoutAnimated(0, 0, 0, Width, Heig";
__ref._touchpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),0,0,_width,_height);
RDebugUtils.currentLine=983043;
 //BA.debugLineNum = 983043;BA.debugLine="Vertical = mBase.Height > mBase.Width";
__ref._vertical /*boolean*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()>__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth();
RDebugUtils.currentLine=983044;
 //BA.debugLineNum = 983044;BA.debugLine="size = Max(mBase.Height, mBase.Width) - 2 * Radiu";
__ref._size /*int*/  = (int) (__c.Max(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth())-2*__ref._radius2 /*int*/ );
RDebugUtils.currentLine=983045;
 //BA.debugLineNum = 983045;BA.debugLine="Update";
__ref._update /*String*/ (null);
RDebugUtils.currentLine=983046;
 //BA.debugLineNum = 983046;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.asstepseekbar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asstepseekbar";
RDebugUtils.currentLine=786432;
 //BA.debugLineNum = 786432;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=786433;
 //BA.debugLineNum = 786433;BA.debugLine="Type ASStepSeekBar_Step(Value As Object,ReachedCo";
;
RDebugUtils.currentLine=786435;
 //BA.debugLineNum = 786435;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=786436;
 //BA.debugLineNum = 786436;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=786437;
 //BA.debugLineNum = 786437;BA.debugLine="Public mBase As B4XView 'ignore";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=786438;
 //BA.debugLineNum = 786438;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=786439;
 //BA.debugLineNum = 786439;BA.debugLine="Public ReachedLineColor, UnreachedLineColor, Thum";
_reachedlinecolor = 0;
_unreachedlinecolor = 0;
_thumbcolor = 0;
RDebugUtils.currentLine=786440;
 //BA.debugLineNum = 786440;BA.debugLine="Private cvs As B4XCanvas";
_cvs = new anywheresoftware.b4a.objects.B4XCanvas();
RDebugUtils.currentLine=786441;
 //BA.debugLineNum = 786441;BA.debugLine="Public Tag As Object";
_tag = new Object();
RDebugUtils.currentLine=786442;
 //BA.debugLineNum = 786442;BA.debugLine="Private TouchPanel As B4XView";
_touchpanel = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=786443;
 //BA.debugLineNum = 786443;BA.debugLine="Private mValue As Int = 0";
_mvalue = (int) (0);
RDebugUtils.currentLine=786444;
 //BA.debugLineNum = 786444;BA.debugLine="Private MinValue As Int = 0";
_minvalue = (int) (0);
RDebugUtils.currentLine=786445;
 //BA.debugLineNum = 786445;BA.debugLine="Private MaxValue As Int = 100";
_maxvalue = (int) (100);
RDebugUtils.currentLine=786446;
 //BA.debugLineNum = 786446;BA.debugLine="Public Interval As Int = 1";
_interval = (int) (1);
RDebugUtils.currentLine=786447;
 //BA.debugLineNum = 786447;BA.debugLine="Private Vertical As Boolean";
_vertical = false;
RDebugUtils.currentLine=786448;
 //BA.debugLineNum = 786448;BA.debugLine="Public ReachedLineSize = 4dip, UnreachedLineSize";
_reachedlinesize = __c.DipToCurrent((int) (4));
_unreachedlinesize = __c.DipToCurrent((int) (2));
_radius1 = __c.DipToCurrent((int) (6));
_radius2 = __c.DipToCurrent((int) (20));
RDebugUtils.currentLine=786449;
 //BA.debugLineNum = 786449;BA.debugLine="Private Pressed As Boolean";
_pressed = false;
RDebugUtils.currentLine=786450;
 //BA.debugLineNum = 786450;BA.debugLine="Private size As Int";
_size = 0;
RDebugUtils.currentLine=786451;
 //BA.debugLineNum = 786451;BA.debugLine="Private lst_Sections As List";
_lst_sections = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=786452;
 //BA.debugLineNum = 786452;BA.debugLine="Private lst_X,lst_Y As List";
_lst_x = new anywheresoftware.b4a.objects.collections.List();
_lst_y = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=786453;
 //BA.debugLineNum = 786453;BA.debugLine="Private m_Index As Int = 0";
_m_index = (int) (0);
RDebugUtils.currentLine=786454;
 //BA.debugLineNum = 786454;BA.debugLine="End Sub";
return "";
}
public String  _clear(b4j.example.asstepseekbar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asstepseekbar";
if (Debug.shouldDelegate(ba, "clear", false))
	 {return ((String) Debug.delegate(ba, "clear", null));}
RDebugUtils.currentLine=1638400;
 //BA.debugLineNum = 1638400;BA.debugLine="Public Sub Clear";
RDebugUtils.currentLine=1638401;
 //BA.debugLineNum = 1638401;BA.debugLine="lst_Sections.Clear";
__ref._lst_sections /*anywheresoftware.b4a.objects.collections.List*/ .Clear();
RDebugUtils.currentLine=1638402;
 //BA.debugLineNum = 1638402;BA.debugLine="lst_X.Clear";
__ref._lst_x /*anywheresoftware.b4a.objects.collections.List*/ .Clear();
RDebugUtils.currentLine=1638403;
 //BA.debugLineNum = 1638403;BA.debugLine="lst_Y.Clear";
__ref._lst_y /*anywheresoftware.b4a.objects.collections.List*/ .Clear();
RDebugUtils.currentLine=1638404;
 //BA.debugLineNum = 1638404;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(b4j.example.asstepseekbar __ref,Object _base,anywheresoftware.b4j.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="asstepseekbar";
if (Debug.shouldDelegate(ba, "designercreateview", false))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
RDebugUtils.currentLine=917504;
 //BA.debugLineNum = 917504;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
RDebugUtils.currentLine=917505;
 //BA.debugLineNum = 917505;BA.debugLine="mBase = Base";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
RDebugUtils.currentLine=917506;
 //BA.debugLineNum = 917506;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
__ref._tag /*Object*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTag();
RDebugUtils.currentLine=917506;
 //BA.debugLineNum = 917506;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag(this);
RDebugUtils.currentLine=917507;
 //BA.debugLineNum = 917507;BA.debugLine="ReachedLineColor = xui.PaintOrColorToColor(Props.";
__ref._reachedlinecolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("ReachedLineColor")));
RDebugUtils.currentLine=917508;
 //BA.debugLineNum = 917508;BA.debugLine="UnreachedLineColor = xui.PaintOrColorToColor(Prop";
__ref._unreachedlinecolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("UnreachedLineColor")));
RDebugUtils.currentLine=917509;
 //BA.debugLineNum = 917509;BA.debugLine="ThumbColor = xui.PaintOrColorToColor(Props.Get(\"T";
__ref._thumbcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("ThumbColor")));
RDebugUtils.currentLine=917510;
 //BA.debugLineNum = 917510;BA.debugLine="cvs.Initialize(mBase)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Initialize(ba,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=917511;
 //BA.debugLineNum = 917511;BA.debugLine="TouchPanel = xui.CreatePanel(\"TouchPanel\")";
__ref._touchpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"TouchPanel");
RDebugUtils.currentLine=917512;
 //BA.debugLineNum = 917512;BA.debugLine="mBase.AddView(TouchPanel, 0, 0, mBase.Width, mBas";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._touchpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=917516;
 //BA.debugLineNum = 917516;BA.debugLine="End Sub";
return "";
}
public int  _getsize(b4j.example.asstepseekbar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asstepseekbar";
if (Debug.shouldDelegate(ba, "getsize", false))
	 {return ((Integer) Debug.delegate(ba, "getsize", null));}
RDebugUtils.currentLine=1441792;
 //BA.debugLineNum = 1441792;BA.debugLine="Public Sub getSize As Int";
RDebugUtils.currentLine=1441793;
 //BA.debugLineNum = 1441793;BA.debugLine="Return lst_Sections.Size";
if (true) return __ref._lst_sections /*anywheresoftware.b4a.objects.collections.List*/ .getSize();
RDebugUtils.currentLine=1441794;
 //BA.debugLineNum = 1441794;BA.debugLine="End Sub";
return 0;
}
public int  _getstepindex(b4j.example.asstepseekbar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asstepseekbar";
if (Debug.shouldDelegate(ba, "getstepindex", false))
	 {return ((Integer) Debug.delegate(ba, "getstepindex", null));}
RDebugUtils.currentLine=1376256;
 //BA.debugLineNum = 1376256;BA.debugLine="Public Sub getStepIndex As Int";
RDebugUtils.currentLine=1376257;
 //BA.debugLineNum = 1376257;BA.debugLine="Return m_Index";
if (true) return __ref._m_index /*int*/ ;
RDebugUtils.currentLine=1376258;
 //BA.debugLineNum = 1376258;BA.debugLine="End Sub";
return 0;
}
public Object  _getstepvalue(b4j.example.asstepseekbar __ref,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="asstepseekbar";
if (Debug.shouldDelegate(ba, "getstepvalue", false))
	 {return ((Object) Debug.delegate(ba, "getstepvalue", new Object[] {_index}));}
RDebugUtils.currentLine=1507328;
 //BA.debugLineNum = 1507328;BA.debugLine="Public Sub GetStepValue(Index As Int) As Object";
RDebugUtils.currentLine=1507329;
 //BA.debugLineNum = 1507329;BA.debugLine="Return lst_Sections.Get(Index).As(ASStepSeekBar_S";
if (true) return ((b4j.example.asstepseekbar._asstepseekbar_step)(__ref._lst_sections /*anywheresoftware.b4a.objects.collections.List*/ .Get(_index))).Value /*Object*/ ;
RDebugUtils.currentLine=1507330;
 //BA.debugLineNum = 1507330;BA.debugLine="End Sub";
return null;
}
public String  _initialize(b4j.example.asstepseekbar __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="asstepseekbar";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
RDebugUtils.currentLine=851968;
 //BA.debugLineNum = 851968;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=851969;
 //BA.debugLineNum = 851969;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=851970;
 //BA.debugLineNum = 851970;BA.debugLine="mCallBack = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=851971;
 //BA.debugLineNum = 851971;BA.debugLine="lst_Sections.Initialize";
__ref._lst_sections /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=851972;
 //BA.debugLineNum = 851972;BA.debugLine="lst_X.Initialize : lst_Y.Initialize";
__ref._lst_x /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=851972;
 //BA.debugLineNum = 851972;BA.debugLine="lst_X.Initialize : lst_Y.Initialize";
__ref._lst_y /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=851973;
 //BA.debugLineNum = 851973;BA.debugLine="End Sub";
return "";
}
public String  _raisetouchstateevent(b4j.example.asstepseekbar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asstepseekbar";
if (Debug.shouldDelegate(ba, "raisetouchstateevent", false))
	 {return ((String) Debug.delegate(ba, "raisetouchstateevent", null));}
RDebugUtils.currentLine=1179648;
 //BA.debugLineNum = 1179648;BA.debugLine="Private Sub RaiseTouchStateEvent";
RDebugUtils.currentLine=1179649;
 //BA.debugLineNum = 1179649;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_TouchS";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_TouchStateChanged",(int) (1))) { 
RDebugUtils.currentLine=1179650;
 //BA.debugLineNum = 1179650;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_TouchS";
__c.CallSubDelayed2(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_TouchStateChanged",(Object)(__ref._pressed /*boolean*/ ));
 };
RDebugUtils.currentLine=1179652;
 //BA.debugLineNum = 1179652;BA.debugLine="End Sub";
return "";
}
public String  _setstepindex(b4j.example.asstepseekbar __ref,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="asstepseekbar";
if (Debug.shouldDelegate(ba, "setstepindex", false))
	 {return ((String) Debug.delegate(ba, "setstepindex", new Object[] {_index}));}
RDebugUtils.currentLine=1310720;
 //BA.debugLineNum = 1310720;BA.debugLine="Public Sub setStepIndex(Index As Int)";
RDebugUtils.currentLine=1310722;
 //BA.debugLineNum = 1310722;BA.debugLine="If Vertical = False Then";
if (__ref._vertical /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=1310723;
 //BA.debugLineNum = 1310723;BA.debugLine="SetValueBasedOnTouch(lst_X.Get(Index) , 0)";
__ref._setvaluebasedontouch /*String*/ (null,(int)(BA.ObjectToNumber(__ref._lst_x /*anywheresoftware.b4a.objects.collections.List*/ .Get(_index))),(int) (0));
 }else {
RDebugUtils.currentLine=1310725;
 //BA.debugLineNum = 1310725;BA.debugLine="SetValueBasedOnTouch(0 ,lst_Y.Get(Index))";
__ref._setvaluebasedontouch /*String*/ (null,(int) (0),(int)(BA.ObjectToNumber(__ref._lst_y /*anywheresoftware.b4a.objects.collections.List*/ .Get(_index))));
 };
RDebugUtils.currentLine=1310727;
 //BA.debugLineNum = 1310727;BA.debugLine="Update";
__ref._update /*String*/ (null);
RDebugUtils.currentLine=1310728;
 //BA.debugLineNum = 1310728;BA.debugLine="End Sub";
return "";
}
public String  _setvaluebasedontouch(b4j.example.asstepseekbar __ref,int _x,int _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="asstepseekbar";
if (Debug.shouldDelegate(ba, "setvaluebasedontouch", false))
	 {return ((String) Debug.delegate(ba, "setvaluebasedontouch", new Object[] {_x,_y}));}
int _v = 0;
int _newvalue = 0;
int _i = 0;
b4j.example.asstepseekbar._asstepseekbar_step _section = null;
RDebugUtils.currentLine=1245184;
 //BA.debugLineNum = 1245184;BA.debugLine="Private Sub SetValueBasedOnTouch(x As Int, y As In";
RDebugUtils.currentLine=1245185;
 //BA.debugLineNum = 1245185;BA.debugLine="Dim v As Int";
_v = 0;
RDebugUtils.currentLine=1245186;
 //BA.debugLineNum = 1245186;BA.debugLine="If Vertical Then";
if (__ref._vertical /*boolean*/ ) { 
RDebugUtils.currentLine=1245187;
 //BA.debugLineNum = 1245187;BA.debugLine="v = (mBase.Height - Radius2 - y) / size * (MaxVa";
_v = (int) ((__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-__ref._radius2 /*int*/ -_y)/(double)__ref._size /*int*/ *(__ref._maxvalue /*int*/ -__ref._minvalue /*int*/ )+__ref._minvalue /*int*/ );
 }else {
RDebugUtils.currentLine=1245189;
 //BA.debugLineNum = 1245189;BA.debugLine="v = (x - Radius2) / size * (MaxValue - MinValue)";
_v = (int) ((_x-__ref._radius2 /*int*/ )/(double)__ref._size /*int*/ *(__ref._maxvalue /*int*/ -__ref._minvalue /*int*/ )+__ref._minvalue /*int*/ );
 };
RDebugUtils.currentLine=1245191;
 //BA.debugLineNum = 1245191;BA.debugLine="v = Round (v / Interval) * Interval";
_v = (int) (__c.Round(_v/(double)__ref._interval /*int*/ )*__ref._interval /*int*/ );
RDebugUtils.currentLine=1245192;
 //BA.debugLineNum = 1245192;BA.debugLine="Dim NewValue As Int = Max(MinValue, Min(MaxValue,";
_newvalue = (int) (__c.Max(__ref._minvalue /*int*/ ,__c.Min(__ref._maxvalue /*int*/ ,_v)));
RDebugUtils.currentLine=1245193;
 //BA.debugLineNum = 1245193;BA.debugLine="If NewValue <> mValue Then";
if (_newvalue!=__ref._mvalue /*int*/ ) { 
RDebugUtils.currentLine=1245194;
 //BA.debugLineNum = 1245194;BA.debugLine="mValue = NewValue";
__ref._mvalue /*int*/  = _newvalue;
RDebugUtils.currentLine=1245196;
 //BA.debugLineNum = 1245196;BA.debugLine="If Vertical = False Then";
if (__ref._vertical /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=1245197;
 //BA.debugLineNum = 1245197;BA.debugLine="For i = 0 To lst_X.Size -1";
{
final int step12 = 1;
final int limit12 = (int) (__ref._lst_x /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit12 ;_i = _i + step12 ) {
RDebugUtils.currentLine=1245198;
 //BA.debugLineNum = 1245198;BA.debugLine="If x > (lst_X.Get(i) - Radius2) And x < (lst_X";
if (_x>((double)(BA.ObjectToNumber(__ref._lst_x /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)))-__ref._radius2 /*int*/ ) && _x<((double)(BA.ObjectToNumber(__ref._lst_x /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)))+__ref._radius2 /*int*/ )) { 
RDebugUtils.currentLine=1245199;
 //BA.debugLineNum = 1245199;BA.debugLine="m_Index = i";
__ref._m_index /*int*/  = _i;
RDebugUtils.currentLine=1245200;
 //BA.debugLineNum = 1245200;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_Va";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_ValueChanged",(int) (2))) { 
RDebugUtils.currentLine=1245201;
 //BA.debugLineNum = 1245201;BA.debugLine="Dim section As ASStepSeekBar_Step = lst_Sect";
_section = (b4j.example.asstepseekbar._asstepseekbar_step)(__ref._lst_sections /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
RDebugUtils.currentLine=1245202;
 //BA.debugLineNum = 1245202;BA.debugLine="CallSubDelayed3(mCallBack, mEventName & \"_Va";
__c.CallSubDelayed3(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_ValueChanged",(Object)(_i),_section.Value /*Object*/ );
 };
RDebugUtils.currentLine=1245204;
 //BA.debugLineNum = 1245204;BA.debugLine="Exit";
if (true) break;
 };
 }
};
 }else {
RDebugUtils.currentLine=1245208;
 //BA.debugLineNum = 1245208;BA.debugLine="For i = 0 To lst_Y.Size -1";
{
final int step23 = 1;
final int limit23 = (int) (__ref._lst_y /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit23 ;_i = _i + step23 ) {
RDebugUtils.currentLine=1245209;
 //BA.debugLineNum = 1245209;BA.debugLine="If y > (lst_Y.Get(i) - Radius2) And y < (lst_Y";
if (_y>((double)(BA.ObjectToNumber(__ref._lst_y /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)))-__ref._radius2 /*int*/ ) && _y<((double)(BA.ObjectToNumber(__ref._lst_y /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)))+__ref._radius2 /*int*/ )) { 
RDebugUtils.currentLine=1245210;
 //BA.debugLineNum = 1245210;BA.debugLine="m_Index = i";
__ref._m_index /*int*/  = _i;
RDebugUtils.currentLine=1245211;
 //BA.debugLineNum = 1245211;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_Va";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_ValueChanged",(int) (2))) { 
RDebugUtils.currentLine=1245212;
 //BA.debugLineNum = 1245212;BA.debugLine="Dim section As ASStepSeekBar_Step = lst_Sect";
_section = (b4j.example.asstepseekbar._asstepseekbar_step)(__ref._lst_sections /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
RDebugUtils.currentLine=1245213;
 //BA.debugLineNum = 1245213;BA.debugLine="CallSubDelayed3(mCallBack, mEventName & \"_Va";
__c.CallSubDelayed3(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_ValueChanged",(Object)(_i),_section.Value /*Object*/ );
 };
RDebugUtils.currentLine=1245215;
 //BA.debugLineNum = 1245215;BA.debugLine="Exit";
if (true) break;
 };
 }
};
 };
 };
RDebugUtils.currentLine=1245220;
 //BA.debugLineNum = 1245220;BA.debugLine="End Sub";
return "";
}
public String  _touchpanel_touch(b4j.example.asstepseekbar __ref,int _action,float _x,float _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="asstepseekbar";
if (Debug.shouldDelegate(ba, "touchpanel_touch", false))
	 {return ((String) Debug.delegate(ba, "touchpanel_touch", new Object[] {_action,_x,_y}));}
int _i = 0;
int _thisindex = 0;
float _itemwidth = 0f;
float _itemheight = 0f;
RDebugUtils.currentLine=1114112;
 //BA.debugLineNum = 1114112;BA.debugLine="Private Sub TouchPanel_Touch (Action As Int, X As";
RDebugUtils.currentLine=1114113;
 //BA.debugLineNum = 1114113;BA.debugLine="If Action = TouchPanel.TOUCH_ACTION_DOWN Then";
if (_action==__ref._touchpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .TOUCH_ACTION_DOWN) { 
RDebugUtils.currentLine=1114114;
 //BA.debugLineNum = 1114114;BA.debugLine="Pressed = True";
__ref._pressed /*boolean*/  = __c.True;
RDebugUtils.currentLine=1114115;
 //BA.debugLineNum = 1114115;BA.debugLine="RaiseTouchStateEvent";
__ref._raisetouchstateevent /*String*/ (null);
 }else 
{RDebugUtils.currentLine=1114117;
 //BA.debugLineNum = 1114117;BA.debugLine="Else If Action = TouchPanel.TOUCH_ACTION_MOVE The";
if (_action==__ref._touchpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .TOUCH_ACTION_MOVE) { 
RDebugUtils.currentLine=1114119;
 //BA.debugLineNum = 1114119;BA.debugLine="If Vertical = False Then";
if (__ref._vertical /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=1114120;
 //BA.debugLineNum = 1114120;BA.debugLine="For i = 0 To lst_X.Size -1";
{
final int step6 = 1;
final int limit6 = (int) (__ref._lst_x /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit6 ;_i = _i + step6 ) {
RDebugUtils.currentLine=1114121;
 //BA.debugLineNum = 1114121;BA.debugLine="If x > (lst_X.Get(i) - Radius2) And x < (lst_X";
if (_x>((double)(BA.ObjectToNumber(__ref._lst_x /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)))-__ref._radius2 /*int*/ ) && _x<((double)(BA.ObjectToNumber(__ref._lst_x /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)))+__ref._radius2 /*int*/ )) { 
RDebugUtils.currentLine=1114122;
 //BA.debugLineNum = 1114122;BA.debugLine="SetValueBasedOnTouch(lst_X.Get(i) , Y)";
__ref._setvaluebasedontouch /*String*/ (null,(int)(BA.ObjectToNumber(__ref._lst_x /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i))),(int) (_y));
RDebugUtils.currentLine=1114123;
 //BA.debugLineNum = 1114123;BA.debugLine="Exit";
if (true) break;
 };
 }
};
 }else {
RDebugUtils.currentLine=1114127;
 //BA.debugLineNum = 1114127;BA.debugLine="For i = 0 To lst_Y.Size -1";
{
final int step13 = 1;
final int limit13 = (int) (__ref._lst_y /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit13 ;_i = _i + step13 ) {
RDebugUtils.currentLine=1114128;
 //BA.debugLineNum = 1114128;BA.debugLine="If y > (lst_Y.Get(i) - Radius2) And y < (lst_Y";
if (_y>((double)(BA.ObjectToNumber(__ref._lst_y /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)))-__ref._radius2 /*int*/ ) && _y<((double)(BA.ObjectToNumber(__ref._lst_y /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)))+__ref._radius2 /*int*/ )) { 
RDebugUtils.currentLine=1114129;
 //BA.debugLineNum = 1114129;BA.debugLine="SetValueBasedOnTouch(x , lst_Y.Get(i))";
__ref._setvaluebasedontouch /*String*/ (null,(int) (_x),(int)(BA.ObjectToNumber(__ref._lst_y /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i))));
RDebugUtils.currentLine=1114130;
 //BA.debugLineNum = 1114130;BA.debugLine="Exit";
if (true) break;
 };
 }
};
 };
 }else 
{RDebugUtils.currentLine=1114135;
 //BA.debugLineNum = 1114135;BA.debugLine="Else If Action = TouchPanel.TOUCH_ACTION_UP Then";
if (_action==__ref._touchpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .TOUCH_ACTION_UP) { 
RDebugUtils.currentLine=1114136;
 //BA.debugLineNum = 1114136;BA.debugLine="Pressed = False";
__ref._pressed /*boolean*/  = __c.False;
RDebugUtils.currentLine=1114137;
 //BA.debugLineNum = 1114137;BA.debugLine="If Vertical = False Then";
if (__ref._vertical /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=1114138;
 //BA.debugLineNum = 1114138;BA.debugLine="Dim ThisIndex As Int = 0";
_thisindex = (int) (0);
RDebugUtils.currentLine=1114139;
 //BA.debugLineNum = 1114139;BA.debugLine="Dim ItemWidth As Float = (mBase.Width/lst_X.Siz";
_itemwidth = (float) ((__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)__ref._lst_x /*anywheresoftware.b4a.objects.collections.List*/ .getSize())+__ref._radius2 /*int*/ *2);
RDebugUtils.currentLine=1114140;
 //BA.debugLineNum = 1114140;BA.debugLine="For i = 0 To lst_X.Size -1";
{
final int step25 = 1;
final int limit25 = (int) (__ref._lst_x /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit25 ;_i = _i + step25 ) {
RDebugUtils.currentLine=1114141;
 //BA.debugLineNum = 1114141;BA.debugLine="If Round(x) >= Round((lst_X.Get(i) - (ItemWidt";
if (__c.Round(_x)>=__c.Round(((double)(BA.ObjectToNumber(__ref._lst_x /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)))-(_itemwidth/(double)2))) && __c.Round(_x)<=__c.Round(((double)(BA.ObjectToNumber(__ref._lst_x /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)))+(_itemwidth/(double)2)))) { 
RDebugUtils.currentLine=1114142;
 //BA.debugLineNum = 1114142;BA.debugLine="ThisIndex = i";
_thisindex = _i;
RDebugUtils.currentLine=1114143;
 //BA.debugLineNum = 1114143;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=1114150;
 //BA.debugLineNum = 1114150;BA.debugLine="SetValueBasedOnTouch(lst_X.Get(ThisIndex) , Y)";
__ref._setvaluebasedontouch /*String*/ (null,(int)(BA.ObjectToNumber(__ref._lst_x /*anywheresoftware.b4a.objects.collections.List*/ .Get(_thisindex))),(int) (_y));
 }else {
RDebugUtils.currentLine=1114152;
 //BA.debugLineNum = 1114152;BA.debugLine="Dim ThisIndex As Int = 0";
_thisindex = (int) (0);
RDebugUtils.currentLine=1114153;
 //BA.debugLineNum = 1114153;BA.debugLine="Dim ItemHeight As Float = (mBase.Height/lst_Y.S";
_itemheight = (float) ((__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)__ref._lst_y /*anywheresoftware.b4a.objects.collections.List*/ .getSize())+__ref._radius2 /*int*/ *2);
RDebugUtils.currentLine=1114154;
 //BA.debugLineNum = 1114154;BA.debugLine="For i = 0 To lst_Y.Size -1";
{
final int step35 = 1;
final int limit35 = (int) (__ref._lst_y /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit35 ;_i = _i + step35 ) {
RDebugUtils.currentLine=1114155;
 //BA.debugLineNum = 1114155;BA.debugLine="If Round(y) >= Round((lst_Y.Get(i) - (ItemHeig";
if (__c.Round(_y)>=__c.Round(((double)(BA.ObjectToNumber(__ref._lst_y /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)))-(_itemheight/(double)2))) && __c.Round(_y)<=__c.Round(((double)(BA.ObjectToNumber(__ref._lst_y /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)))+(_itemheight/(double)2)))) { 
RDebugUtils.currentLine=1114156;
 //BA.debugLineNum = 1114156;BA.debugLine="ThisIndex = i";
_thisindex = _i;
RDebugUtils.currentLine=1114157;
 //BA.debugLineNum = 1114157;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=1114164;
 //BA.debugLineNum = 1114164;BA.debugLine="SetValueBasedOnTouch(x , lst_Y.Get(ThisIndex))";
__ref._setvaluebasedontouch /*String*/ (null,(int) (_x),(int)(BA.ObjectToNumber(__ref._lst_y /*anywheresoftware.b4a.objects.collections.List*/ .Get(_thisindex))));
 };
RDebugUtils.currentLine=1114166;
 //BA.debugLineNum = 1114166;BA.debugLine="RaiseTouchStateEvent";
__ref._raisetouchstateevent /*String*/ (null);
 }}}
;
RDebugUtils.currentLine=1114168;
 //BA.debugLineNum = 1114168;BA.debugLine="Update";
__ref._update /*String*/ (null);
RDebugUtils.currentLine=1114169;
 //BA.debugLineNum = 1114169;BA.debugLine="End Sub";
return "";
}
}