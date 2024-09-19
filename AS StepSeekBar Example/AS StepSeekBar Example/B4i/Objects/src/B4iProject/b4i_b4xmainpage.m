
#import "b4i_b4xmainpage.h"
#import "b4i_main.h"
#import "b4i_asstepseekbar.h"
#import "b4i_b4xpages.h"
#import "b4i_b4xbitset.h"
#import "b4i_b4xbytesbuilder.h"
#import "b4i_b4xcache.h"
#import "b4i_b4xcollections.h"
#import "b4i_b4xcomparatorsort.h"
#import "b4i_b4xorderedmap.h"
#import "b4i_b4xset.h"
#import "b4i_b4xpagesdelegator.h"
#import "b4i_b4xpagesmanager.h"

@interface ResumableSub_b4xmainpage_B4XPage_Created :B4IResumableSub 
- (instancetype) init: (b4i_b4xmainpage*) parent1 :(b4i_b4xmainpage*) __ref1 :(B4XViewWrapper*) _root11;
@end
@implementation ResumableSub_b4xmainpage_B4XPage_Created {
b4i_b4xmainpage* parent;
b4i_b4xmainpage* __ref;
B4XViewWrapper* _root1;
int _width;
int _height;
int _i;
int step4;
int limit4;
}
- (instancetype) init: (b4i_b4xmainpage*) parent1 :(b4i_b4xmainpage*) __ref1 :(B4XViewWrapper*) _root11 {
self->__ref = __ref1;
self->_root1 = _root11;
self->parent = parent1;
self->__ref = parent;
return self;
}
b4i_b4xmainpage* __ref;
- (void) resume:(B4I*)bi1 :(NSArray*)result {
self.bi = bi1;
B4IRDebugUtils.currentModule=@"b4xmainpage";

    while (true) {
        switch (self->_state) {
            case -1:
return;

case 0:
//C
self->_state = 1;
B4IRDebugUtils.currentLine=393217;
 //BA.debugLineNum = 393217;BA.debugLine="Root = Root1";
self->__ref->__root /*B4XViewWrapper**/  = self->_root1;
B4IRDebugUtils.currentLine=393218;
 //BA.debugLineNum = 393218;BA.debugLine="Root.LoadLayout(\"frm_main\")";
[self->__ref->__root /*B4XViewWrapper**/  LoadLayout:@"frm_main" :self.bi];
B4IRDebugUtils.currentLine=393221;
 //BA.debugLineNum = 393221;BA.debugLine="Wait For B4XPage_Resize (Width As Int, Height As";
[parent->___c WaitFor:@"b4xpage_resize::" :self.bi :[[B4IDelegatableResumableSub alloc]init:self :@"b4xmainpage" :@"b4xpage_created"] :nil];
self->_state = 5;
return;
case 5:
//C
self->_state = 1;
self->_width = ((NSNumber*) result[1]).intValue;
self->_height = ((NSNumber*) result[2]).intValue;
;
B4IRDebugUtils.currentLine=393224;
 //BA.debugLineNum = 393224;BA.debugLine="For i = 0 To 4 -1";
if (true) break;

case 1:
//for
self->_state = 4;
step4 = 1;
limit4 = (int) (4-1);
self->_i = (int) (0) ;
self->_state = 6;
if (true) break;

case 6:
//C
self->_state = 4;
if ((step4 > 0 && self->_i <= limit4) || (step4 < 0 && self->_i >= limit4)) self->_state = 3;
if (true) break;

case 7:
//C
self->_state = 6;
self->_i = ((int)(0 + self->_i + step4)) ;
if (true) break;

case 3:
//C
self->_state = 7;
B4IRDebugUtils.currentLine=393225;
 //BA.debugLineNum = 393225;BA.debugLine="ASStepSeekBar1.AddStep(xui.Color_White,\"Item \" &";
[self->__ref->__asstepseekbar1 /*b4i_asstepseekbar**/  _addstep /*NSString**/ :nil :[self->__ref->__xui /*B4IXUI**/  Color_White] :(NSObject*)([@[@"Item ",[self.bi NumberToString:@((self->_i))]] componentsJoinedByString:@""])];
B4IRDebugUtils.currentLine=393226;
 //BA.debugLineNum = 393226;BA.debugLine="ASStepSeekBar2.AddStep(xui.Color_White,\"Item \" &";
[self->__ref->__asstepseekbar2 /*b4i_asstepseekbar**/  _addstep /*NSString**/ :nil :[self->__ref->__xui /*B4IXUI**/  Color_White] :(NSObject*)([@[@"Item ",[self.bi NumberToString:@((self->_i))]] componentsJoinedByString:@""])];
 if (true) break;
if (true) break;

case 4:
//C
self->_state = -1;
;
B4IRDebugUtils.currentLine=393229;
 //BA.debugLineNum = 393229;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
@end

@implementation b4i_b4xmainpage 


+ (B4I*)createBI {
    return [B4IShellBI alloc];
}

- (void)dealloc {
    if (self.bi != nil)
        NSLog(@"Class (b4i_b4xmainpage) instance released.");
}

- (NSString*)  _asstepseekbar1_valuechanged:(b4i_b4xmainpage*) __ref :(int) _index :(NSObject*) _value{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xmainpage";
if ([B4IDebug shouldDelegate: @"asstepseekbar1_valuechanged"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"asstepseekbar1_valuechanged::" :@[@(_index),[B4I nilToNSNull:_value]]]);}
B4IRDebugUtils.currentLine=458752;
 //BA.debugLineNum = 458752;BA.debugLine="Private Sub ASStepSeekBar1_ValueChanged (Index As";
B4IRDebugUtils.currentLine=458753;
 //BA.debugLineNum = 458753;BA.debugLine="Log(\"Index: \" & Index)";
[self->___c LogImpl:@"2458753" :[@[@"Index: ",[self.bi NumberToString:@(_index)]] componentsJoinedByString:@""] :0];
B4IRDebugUtils.currentLine=458754;
 //BA.debugLineNum = 458754;BA.debugLine="Log(\"Value: \" & Value)";
[self->___c LogImpl:@"2458754" :[@[@"Value: ",[self.bi ObjectToString:_value]] componentsJoinedByString:@""] :0];
B4IRDebugUtils.currentLine=458755;
 //BA.debugLineNum = 458755;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _asstepseekbar2_valuechanged:(b4i_b4xmainpage*) __ref :(int) _index :(NSObject*) _value{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xmainpage";
if ([B4IDebug shouldDelegate: @"asstepseekbar2_valuechanged"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"asstepseekbar2_valuechanged::" :@[@(_index),[B4I nilToNSNull:_value]]]);}
B4IRDebugUtils.currentLine=524288;
 //BA.debugLineNum = 524288;BA.debugLine="Private Sub ASStepSeekBar2_ValueChanged (Index As";
B4IRDebugUtils.currentLine=524289;
 //BA.debugLineNum = 524289;BA.debugLine="Log(\"Index: \" & Index)";
[self->___c LogImpl:@"2524289" :[@[@"Index: ",[self.bi NumberToString:@(_index)]] componentsJoinedByString:@""] :0];
B4IRDebugUtils.currentLine=524290;
 //BA.debugLineNum = 524290;BA.debugLine="Log(\"Value: \" & Value)";
[self->___c LogImpl:@"2524290" :[@[@"Value: ",[self.bi ObjectToString:_value]] componentsJoinedByString:@""] :0];
B4IRDebugUtils.currentLine=524291;
 //BA.debugLineNum = 524291;BA.debugLine="End Sub";
return @"";
}
- (void)  _b4xpage_created:(b4i_b4xmainpage*) __ref :(B4XViewWrapper*) _root1{
B4IRDebugUtils.currentModule=@"b4xmainpage";
if ([B4IDebug shouldDelegate: @"b4xpage_created"])
	 {[B4IDebug delegate:self.bi :@"b4xpage_created:" :@[[B4I nilToNSNull:_root1]]]; return;}
ResumableSub_b4xmainpage_B4XPage_Created* rsub = [[ResumableSub_b4xmainpage_B4XPage_Created alloc] init:self : __ref: _root1];
[rsub resume:self.bi :nil];
}
//-1893627157
- (NSString*)  _class_globals:(b4i_b4xmainpage*) __ref{
__ref = self;
self->__main=[b4i_main new];
self->__b4xpages=[b4i_b4xpages new];
self->__b4xcollections=[b4i_b4xcollections new];
B4IRDebugUtils.currentModule=@"b4xmainpage";
B4IRDebugUtils.currentLine=262144;
 //BA.debugLineNum = 262144;BA.debugLine="Sub Class_Globals";
B4IRDebugUtils.currentLine=262145;
 //BA.debugLineNum = 262145;BA.debugLine="Private Root As B4XView";
self->__root = [B4XViewWrapper new];
B4IRDebugUtils.currentLine=262146;
 //BA.debugLineNum = 262146;BA.debugLine="Private xui As XUI";
self->__xui = [B4IXUI new];
B4IRDebugUtils.currentLine=262147;
 //BA.debugLineNum = 262147;BA.debugLine="Private ASStepSeekBar1,ASStepSeekBar2 As ASStepSe";
self->__asstepseekbar1 = [b4i_asstepseekbar new];
self->__asstepseekbar2 = [b4i_asstepseekbar new];
B4IRDebugUtils.currentLine=262148;
 //BA.debugLineNum = 262148;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _initialize:(b4i_b4xmainpage*) __ref :(B4I*) _ba{
__ref = self;
[self initializeClassModule];
B4IRDebugUtils.currentModule=@"b4xmainpage";
if ([B4IDebug shouldDelegate: @"initialize"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"initialize:" :@[[B4I nilToNSNull:_ba]]]);}
B4IRDebugUtils.currentLine=327680;
 //BA.debugLineNum = 327680;BA.debugLine="Public Sub Initialize";
B4IRDebugUtils.currentLine=327682;
 //BA.debugLineNum = 327682;BA.debugLine="End Sub";
return @"";
}
@end