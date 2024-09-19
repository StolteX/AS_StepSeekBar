
#import "b4i_b4xset.h"
#import "b4i_main.h"
#import "b4i_b4xmainpage.h"
#import "b4i_asstepseekbar.h"
#import "b4i_b4xpages.h"
#import "b4i_b4xbitset.h"
#import "b4i_b4xbytesbuilder.h"
#import "b4i_b4xcache.h"
#import "b4i_b4xcollections.h"
#import "b4i_b4xcomparatorsort.h"
#import "b4i_b4xorderedmap.h"
#import "b4i_b4xpagesdelegator.h"
#import "b4i_b4xpagesmanager.h"


@implementation b4i_b4xset 


+ (B4I*)createBI {
    return [B4IShellBI alloc];
}

- (void)dealloc {
    if (self.bi != nil)
        NSLog(@"Class (b4i_b4xset) instance released.");
}

- (NSString*)  _initialize:(b4i_b4xset*) __ref :(B4I*) _ba{
__ref = self;
[self initializeClassModule];
B4IRDebugUtils.currentModule=@"b4xset";
if ([B4IDebug shouldDelegate: @"initialize"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"initialize:" :@[[B4I nilToNSNull:_ba]]]);}
B4IRDebugUtils.currentLine=6684672;
 //BA.debugLineNum = 6684672;BA.debugLine="Public Sub Initialize";
B4IRDebugUtils.currentLine=6684673;
 //BA.debugLineNum = 6684673;BA.debugLine="map.Initialize";
[__ref->__map /*b4i_b4xorderedmap**/  _initialize /*NSString**/ :nil :self.bi];
B4IRDebugUtils.currentLine=6684674;
 //BA.debugLineNum = 6684674;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _add:(b4i_b4xset*) __ref :(NSObject*) _value{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xset";
if ([B4IDebug shouldDelegate: @"add"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"add:" :@[[B4I nilToNSNull:_value]]]);}
B4IRDebugUtils.currentLine=6750208;
 //BA.debugLineNum = 6750208;BA.debugLine="Public Sub Add(Value As Object)";
B4IRDebugUtils.currentLine=6750209;
 //BA.debugLineNum = 6750209;BA.debugLine="map.Put(Value, \"\")";
[__ref->__map /*b4i_b4xorderedmap**/  _put /*NSString**/ :nil :_value :(NSObject*)(@"")];
B4IRDebugUtils.currentLine=6750210;
 //BA.debugLineNum = 6750210;BA.debugLine="End Sub";
return @"";
}
- (B4IList*)  _aslist:(b4i_b4xset*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xset";
if ([B4IDebug shouldDelegate: @"aslist"])
	 {return ((B4IList*) [B4IDebug delegate:self.bi :@"aslist" :nil]);}
B4IRDebugUtils.currentLine=7077888;
 //BA.debugLineNum = 7077888;BA.debugLine="Public Sub AsList As List";
B4IRDebugUtils.currentLine=7077889;
 //BA.debugLineNum = 7077889;BA.debugLine="Return map.Keys";
if (true) return [__ref->__map /*b4i_b4xorderedmap**/  _getkeys /*B4IList**/ :nil];
B4IRDebugUtils.currentLine=7077890;
 //BA.debugLineNum = 7077890;BA.debugLine="End Sub";
return nil;
}
- (NSString*)  _class_globals:(b4i_b4xset*) __ref{
__ref = self;
self->__main=[b4i_main new];
self->__b4xpages=[b4i_b4xpages new];
self->__b4xcollections=[b4i_b4xcollections new];
B4IRDebugUtils.currentModule=@"b4xset";
B4IRDebugUtils.currentLine=6619136;
 //BA.debugLineNum = 6619136;BA.debugLine="Sub Class_Globals";
B4IRDebugUtils.currentLine=6619137;
 //BA.debugLineNum = 6619137;BA.debugLine="Private map As B4XOrderedMap";
self->__map = [b4i_b4xorderedmap new];
B4IRDebugUtils.currentLine=6619138;
 //BA.debugLineNum = 6619138;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _clear:(b4i_b4xset*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xset";
if ([B4IDebug shouldDelegate: @"clear"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"clear" :nil]);}
B4IRDebugUtils.currentLine=7012352;
 //BA.debugLineNum = 7012352;BA.debugLine="Public Sub Clear";
B4IRDebugUtils.currentLine=7012353;
 //BA.debugLineNum = 7012353;BA.debugLine="map.Clear";
[__ref->__map /*b4i_b4xorderedmap**/  _clear /*NSString**/ :nil];
B4IRDebugUtils.currentLine=7012354;
 //BA.debugLineNum = 7012354;BA.debugLine="End Sub";
return @"";
}
- (BOOL)  _contains:(b4i_b4xset*) __ref :(NSObject*) _value{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xset";
if ([B4IDebug shouldDelegate: @"contains"])
	 {return ((NSNumber*) [B4IDebug delegate:self.bi :@"contains:" :@[[B4I nilToNSNull:_value]]]).boolValue;}
B4IRDebugUtils.currentLine=6881280;
 //BA.debugLineNum = 6881280;BA.debugLine="Public Sub Contains (Value As Object) As Boolean";
B4IRDebugUtils.currentLine=6881281;
 //BA.debugLineNum = 6881281;BA.debugLine="Return map.ContainsKey(Value)";
if (true) return [__ref->__map /*b4i_b4xorderedmap**/  _containskey /*BOOL*/ :nil :_value];
B4IRDebugUtils.currentLine=6881282;
 //BA.debugLineNum = 6881282;BA.debugLine="End Sub";
return false;
}
- (int)  _getsize:(b4i_b4xset*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xset";
if ([B4IDebug shouldDelegate: @"getsize"])
	 {return ((NSNumber*) [B4IDebug delegate:self.bi :@"getsize" :nil]).intValue;}
B4IRDebugUtils.currentLine=6946816;
 //BA.debugLineNum = 6946816;BA.debugLine="Public Sub getSize As Int";
B4IRDebugUtils.currentLine=6946817;
 //BA.debugLineNum = 6946817;BA.debugLine="Return map.Size";
if (true) return [__ref->__map /*b4i_b4xorderedmap**/  _getsize /*int*/ :nil];
B4IRDebugUtils.currentLine=6946818;
 //BA.debugLineNum = 6946818;BA.debugLine="End Sub";
return 0;
}
- (NSString*)  _remove:(b4i_b4xset*) __ref :(NSObject*) _value{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xset";
if ([B4IDebug shouldDelegate: @"remove"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"remove:" :@[[B4I nilToNSNull:_value]]]);}
B4IRDebugUtils.currentLine=6815744;
 //BA.debugLineNum = 6815744;BA.debugLine="Public Sub Remove(Value As Object)";
B4IRDebugUtils.currentLine=6815745;
 //BA.debugLineNum = 6815745;BA.debugLine="map.Remove(Value)";
[__ref->__map /*b4i_b4xorderedmap**/  _remove /*NSString**/ :nil :_value];
B4IRDebugUtils.currentLine=6815746;
 //BA.debugLineNum = 6815746;BA.debugLine="End Sub";
return @"";
}
@end