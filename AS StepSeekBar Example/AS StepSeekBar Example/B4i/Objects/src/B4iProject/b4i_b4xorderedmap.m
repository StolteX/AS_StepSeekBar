
#import "b4i_b4xorderedmap.h"
#import "b4i_main.h"
#import "b4i_b4xmainpage.h"
#import "b4i_asstepseekbar.h"
#import "b4i_b4xpages.h"
#import "b4i_b4xbitset.h"
#import "b4i_b4xbytesbuilder.h"
#import "b4i_b4xcache.h"
#import "b4i_b4xcollections.h"
#import "b4i_b4xcomparatorsort.h"
#import "b4i_b4xset.h"
#import "b4i_b4xpagesdelegator.h"
#import "b4i_b4xpagesmanager.h"


@implementation b4i_b4xorderedmap 


+ (B4I*)createBI {
    return [B4IShellBI alloc];
}

- (void)dealloc {
    if (self.bi != nil)
        NSLog(@"Class (b4i_b4xorderedmap) instance released.");
}

- (BOOL)  _containskey:(b4i_b4xorderedmap*) __ref :(NSObject*) _key{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xorderedmap";
if ([B4IDebug shouldDelegate: @"containskey"])
	 {return ((NSNumber*) [B4IDebug delegate:self.bi :@"containskey:" :@[[B4I nilToNSNull:_key]]]).boolValue;}
B4IRDebugUtils.currentLine=6291456;
 //BA.debugLineNum = 6291456;BA.debugLine="Public Sub ContainsKey (Key As Object) As Boolean";
B4IRDebugUtils.currentLine=6291457;
 //BA.debugLineNum = 6291457;BA.debugLine="Return map.ContainsKey(Key)";
if (true) return [__ref->__map /*B4IMap**/  ContainsKey:_key];
B4IRDebugUtils.currentLine=6291458;
 //BA.debugLineNum = 6291458;BA.debugLine="End Sub";
return false;
}
- (NSObject*)  _get:(b4i_b4xorderedmap*) __ref :(NSObject*) _key{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xorderedmap";
if ([B4IDebug shouldDelegate: @"get"])
	 {return ((NSObject*) [B4IDebug delegate:self.bi :@"get:" :@[[B4I nilToNSNull:_key]]]);}
B4IRDebugUtils.currentLine=6160384;
 //BA.debugLineNum = 6160384;BA.debugLine="Public Sub Get (Key As Object) As Object";
B4IRDebugUtils.currentLine=6160385;
 //BA.debugLineNum = 6160385;BA.debugLine="Return map.Get(Key)";
if (true) return [__ref->__map /*B4IMap**/  Get:_key];
B4IRDebugUtils.currentLine=6160386;
 //BA.debugLineNum = 6160386;BA.debugLine="End Sub";
return nil;
}
- (NSString*)  _initialize:(b4i_b4xorderedmap*) __ref :(B4I*) _ba{
__ref = self;
[self initializeClassModule];
B4IRDebugUtils.currentModule=@"b4xorderedmap";
if ([B4IDebug shouldDelegate: @"initialize"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"initialize:" :@[[B4I nilToNSNull:_ba]]]);}
B4IRDebugUtils.currentLine=5832704;
 //BA.debugLineNum = 5832704;BA.debugLine="Public Sub Initialize";
B4IRDebugUtils.currentLine=5832705;
 //BA.debugLineNum = 5832705;BA.debugLine="map.Initialize";
[__ref->__map /*B4IMap**/  Initialize];
B4IRDebugUtils.currentLine=5832706;
 //BA.debugLineNum = 5832706;BA.debugLine="list.Initialize";
[__ref->__list /*B4IList**/  Initialize];
B4IRDebugUtils.currentLine=5832707;
 //BA.debugLineNum = 5832707;BA.debugLine="End Sub";
return @"";
}
- (B4IList*)  _getkeys:(b4i_b4xorderedmap*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xorderedmap";
if ([B4IDebug shouldDelegate: @"getkeys"])
	 {return ((B4IList*) [B4IDebug delegate:self.bi :@"getkeys" :nil]);}
B4IRDebugUtils.currentLine=6094848;
 //BA.debugLineNum = 6094848;BA.debugLine="Public Sub getKeys As List";
B4IRDebugUtils.currentLine=6094849;
 //BA.debugLineNum = 6094849;BA.debugLine="Return list";
if (true) return __ref->__list /*B4IList**/ ;
B4IRDebugUtils.currentLine=6094850;
 //BA.debugLineNum = 6094850;BA.debugLine="End Sub";
return nil;
}
- (NSString*)  _put:(b4i_b4xorderedmap*) __ref :(NSObject*) _key :(NSObject*) _value{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xorderedmap";
if ([B4IDebug shouldDelegate: @"put"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"put::" :@[[B4I nilToNSNull:_key],[B4I nilToNSNull:_value]]]);}
B4IRDebugUtils.currentLine=5898240;
 //BA.debugLineNum = 5898240;BA.debugLine="Public Sub Put (Key As Object, Value As Object)";
B4IRDebugUtils.currentLine=5898241;
 //BA.debugLineNum = 5898241;BA.debugLine="If map.ContainsKey(Key) = False Then";
if ([__ref->__map /*B4IMap**/  ContainsKey:_key]==false) { 
B4IRDebugUtils.currentLine=5898242;
 //BA.debugLineNum = 5898242;BA.debugLine="list.Add(Key)";
[__ref->__list /*B4IList**/  Add:_key];
 };
B4IRDebugUtils.currentLine=5898244;
 //BA.debugLineNum = 5898244;BA.debugLine="map.Put(Key, Value)";
[__ref->__map /*B4IMap**/  Put:_key :_value];
B4IRDebugUtils.currentLine=5898245;
 //BA.debugLineNum = 5898245;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _remove:(b4i_b4xorderedmap*) __ref :(NSObject*) _key{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xorderedmap";
if ([B4IDebug shouldDelegate: @"remove"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"remove:" :@[[B4I nilToNSNull:_key]]]);}
B4IRDebugUtils.currentLine=5963776;
 //BA.debugLineNum = 5963776;BA.debugLine="Public Sub Remove (Key As Object)";
B4IRDebugUtils.currentLine=5963777;
 //BA.debugLineNum = 5963777;BA.debugLine="If map.ContainsKey(Key) = False Then Return";
if ([__ref->__map /*B4IMap**/  ContainsKey:_key]==false) { 
if (true) return @"";};
B4IRDebugUtils.currentLine=5963778;
 //BA.debugLineNum = 5963778;BA.debugLine="list.RemoveAt(list.IndexOf(Key))";
[__ref->__list /*B4IList**/  RemoveAt:[__ref->__list /*B4IList**/  IndexOf:_key]];
B4IRDebugUtils.currentLine=5963779;
 //BA.debugLineNum = 5963779;BA.debugLine="map.Remove(Key)";
[__ref->__map /*B4IMap**/  Remove:_key];
B4IRDebugUtils.currentLine=5963780;
 //BA.debugLineNum = 5963780;BA.debugLine="End Sub";
return @"";
}
- (B4IList*)  _getvalues:(b4i_b4xorderedmap*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xorderedmap";
if ([B4IDebug shouldDelegate: @"getvalues"])
	 {return ((B4IList*) [B4IDebug delegate:self.bi :@"getvalues" :nil]);}
B4IList* _res = nil;
NSObject* _key = nil;
B4IRDebugUtils.currentLine=6422528;
 //BA.debugLineNum = 6422528;BA.debugLine="Public Sub getValues As List";
B4IRDebugUtils.currentLine=6422529;
 //BA.debugLineNum = 6422529;BA.debugLine="Dim res As List";
_res = [B4IList new];
B4IRDebugUtils.currentLine=6422530;
 //BA.debugLineNum = 6422530;BA.debugLine="res.Initialize";
[_res Initialize];
B4IRDebugUtils.currentLine=6422531;
 //BA.debugLineNum = 6422531;BA.debugLine="For Each key As Object In list";
{
const id<B4IIterable> group3 = __ref->__list /*B4IList**/ ;
const int groupLen3 = group3.Size
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_key = [group3 Get:index3];
B4IRDebugUtils.currentLine=6422532;
 //BA.debugLineNum = 6422532;BA.debugLine="res.Add(map.Get(key))";
[_res Add:[__ref->__map /*B4IMap**/  Get:_key]];
 }
};
B4IRDebugUtils.currentLine=6422534;
 //BA.debugLineNum = 6422534;BA.debugLine="Return res";
if (true) return _res;
B4IRDebugUtils.currentLine=6422535;
 //BA.debugLineNum = 6422535;BA.debugLine="End Sub";
return nil;
}
- (int)  _getsize:(b4i_b4xorderedmap*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xorderedmap";
if ([B4IDebug shouldDelegate: @"getsize"])
	 {return ((NSNumber*) [B4IDebug delegate:self.bi :@"getsize" :nil]).intValue;}
B4IRDebugUtils.currentLine=6356992;
 //BA.debugLineNum = 6356992;BA.debugLine="Public Sub getSize As Int";
B4IRDebugUtils.currentLine=6356993;
 //BA.debugLineNum = 6356993;BA.debugLine="Return map.Size";
if (true) return [__ref->__map /*B4IMap**/  Size];
B4IRDebugUtils.currentLine=6356994;
 //BA.debugLineNum = 6356994;BA.debugLine="End Sub";
return 0;
}
- (NSString*)  _class_globals:(b4i_b4xorderedmap*) __ref{
__ref = self;
self->__main=[b4i_main new];
self->__b4xpages=[b4i_b4xpages new];
self->__b4xcollections=[b4i_b4xcollections new];
B4IRDebugUtils.currentModule=@"b4xorderedmap";
B4IRDebugUtils.currentLine=5767168;
 //BA.debugLineNum = 5767168;BA.debugLine="Sub Class_Globals";
B4IRDebugUtils.currentLine=5767169;
 //BA.debugLineNum = 5767169;BA.debugLine="Private map As Map";
self->__map = [B4IMap new];
B4IRDebugUtils.currentLine=5767170;
 //BA.debugLineNum = 5767170;BA.debugLine="Private list As List";
self->__list = [B4IList new];
B4IRDebugUtils.currentLine=5767171;
 //BA.debugLineNum = 5767171;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _clear:(b4i_b4xorderedmap*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xorderedmap";
if ([B4IDebug shouldDelegate: @"clear"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"clear" :nil]);}
B4IRDebugUtils.currentLine=6029312;
 //BA.debugLineNum = 6029312;BA.debugLine="Public Sub Clear";
B4IRDebugUtils.currentLine=6029313;
 //BA.debugLineNum = 6029313;BA.debugLine="list.Clear";
[__ref->__list /*B4IList**/  Clear];
B4IRDebugUtils.currentLine=6029314;
 //BA.debugLineNum = 6029314;BA.debugLine="map.Clear";
[__ref->__map /*B4IMap**/  Clear];
B4IRDebugUtils.currentLine=6029315;
 //BA.debugLineNum = 6029315;BA.debugLine="End Sub";
return @"";
}
- (NSObject*)  _getdataforserializator:(b4i_b4xorderedmap*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xorderedmap";
if ([B4IDebug shouldDelegate: @"getdataforserializator"])
	 {return ((NSObject*) [B4IDebug delegate:self.bi :@"getdataforserializator" :nil]);}
B4IRDebugUtils.currentLine=6488064;
 //BA.debugLineNum = 6488064;BA.debugLine="Public Sub GetDataForSerializator As Object";
B4IRDebugUtils.currentLine=6488065;
 //BA.debugLineNum = 6488065;BA.debugLine="Return Array(map, list)";
if (true) return (NSObject*)([[B4IArray alloc]initObjectsWithData:@[[B4I nilToNSNull:(NSObject*)(__ref->__map /*B4IMap**/ )],[B4I nilToNSNull:(NSObject*)((__ref->__list /*B4IList**/ ).object)]]]);
B4IRDebugUtils.currentLine=6488066;
 //BA.debugLineNum = 6488066;BA.debugLine="End Sub";
return nil;
}
- (NSObject*)  _getdefault:(b4i_b4xorderedmap*) __ref :(NSObject*) _key :(NSObject*) _defaultvalue{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xorderedmap";
if ([B4IDebug shouldDelegate: @"getdefault"])
	 {return ((NSObject*) [B4IDebug delegate:self.bi :@"getdefault::" :@[[B4I nilToNSNull:_key],[B4I nilToNSNull:_defaultvalue]]]);}
B4IRDebugUtils.currentLine=6225920;
 //BA.debugLineNum = 6225920;BA.debugLine="Public Sub GetDefault (Key As Object, DefaultValue";
B4IRDebugUtils.currentLine=6225921;
 //BA.debugLineNum = 6225921;BA.debugLine="Return map.GetDefault(Key, DefaultValue)";
if (true) return [__ref->__map /*B4IMap**/  GetDefault:_key :_defaultvalue];
B4IRDebugUtils.currentLine=6225922;
 //BA.debugLineNum = 6225922;BA.debugLine="End Sub";
return nil;
}
- (NSString*)  _setdatafromserializator:(b4i_b4xorderedmap*) __ref :(NSObject*) _data{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xorderedmap";
if ([B4IDebug shouldDelegate: @"setdatafromserializator"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"setdatafromserializator:" :@[[B4I nilToNSNull:_data]]]);}
B4IArray* _o = nil;
B4IRDebugUtils.currentLine=6553600;
 //BA.debugLineNum = 6553600;BA.debugLine="Public Sub SetDataFromSerializator (Data As Object";
B4IRDebugUtils.currentLine=6553601;
 //BA.debugLineNum = 6553601;BA.debugLine="Dim o() As Object = Data";
_o = (B4IArray*)(_data);
B4IRDebugUtils.currentLine=6553602;
 //BA.debugLineNum = 6553602;BA.debugLine="map = o(0)";
__ref->__map /*B4IMap**/  = (B4IMap*)(((NSObject*)[_o getObjectFast:(int) (0)]));
B4IRDebugUtils.currentLine=6553603;
 //BA.debugLineNum = 6553603;BA.debugLine="list = o(1)";
__ref->__list /*B4IList**/  = (B4IList*) [B4IObjectWrapper createWrapper:[B4IList new] object:(NSArray*)(((NSObject*)[_o getObjectFast:(int) (1)]))];
B4IRDebugUtils.currentLine=6553604;
 //BA.debugLineNum = 6553604;BA.debugLine="End Sub";
return @"";
}
@end