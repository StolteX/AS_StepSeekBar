
#import "b4i_b4xcache.h"
#import "b4i_main.h"
#import "b4i_b4xmainpage.h"
#import "b4i_asstepseekbar.h"
#import "b4i_b4xpages.h"
#import "b4i_b4xbitset.h"
#import "b4i_b4xbytesbuilder.h"
#import "b4i_b4xcollections.h"
#import "b4i_b4xcomparatorsort.h"
#import "b4i_b4xorderedmap.h"
#import "b4i_b4xset.h"
#import "b4i_b4xpagesdelegator.h"
#import "b4i_b4xpagesmanager.h"

@implementation _b4xcacheitem
-(void)Initialize{
self.IsInitialized = true;
self->_Value = [NSObject new];
self->_LastAccessedTime = 0L;
self->_Key = @"";
self->_Eternal = false;
}
- (NSString*)description {
return [B4I TypeToString:self :false];}
@end

@implementation b4i_b4xcache 


+ (B4I*)createBI {
    return [B4IShellBI alloc];
}

- (void)dealloc {
    if (self.bi != nil)
        NSLog(@"Class (b4i_b4xcache) instance released.");
}

- (NSString*)  _class_globals:(b4i_b4xcache*) __ref{
__ref = self;
self->__main=[b4i_main new];
self->__b4xpages=[b4i_b4xpages new];
self->__b4xcollections=[b4i_b4xcollections new];
B4IRDebugUtils.currentModule=@"b4xcache";
B4IRDebugUtils.currentLine=3997696;
 //BA.debugLineNum = 3997696;BA.debugLine="Sub Class_Globals";
B4IRDebugUtils.currentLine=3997697;
 //BA.debugLineNum = 3997697;BA.debugLine="Type B4XCacheItem (Value As Object, LastAccessedT";
;
B4IRDebugUtils.currentLine=3997698;
 //BA.debugLineNum = 3997698;BA.debugLine="Private Data As B4XOrderedMap";
self->__data = [b4i_b4xorderedmap new];
B4IRDebugUtils.currentLine=3997699;
 //BA.debugLineNum = 3997699;BA.debugLine="Private mMaxSize As Int = 100";
self->__mmaxsize = (int) (100);
B4IRDebugUtils.currentLine=3997700;
 //BA.debugLineNum = 3997700;BA.debugLine="Private RemoveThreshold As Float = 0.3";
self->__removethreshold = (float) (0.3);
B4IRDebugUtils.currentLine=3997701;
 //BA.debugLineNum = 3997701;BA.debugLine="Private EternalCounts As Int";
self->__eternalcounts = 0;
B4IRDebugUtils.currentLine=3997702;
 //BA.debugLineNum = 3997702;BA.debugLine="End Sub";
return @"";
}
- (BOOL)  _containskey:(b4i_b4xcache*) __ref :(NSString*) _key{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xcache";
if ([B4IDebug shouldDelegate: @"containskey"])
	 {return ((NSNumber*) [B4IDebug delegate:self.bi :@"containskey:" :@[[B4I nilToNSNull:_key]]]).boolValue;}
B4IRDebugUtils.currentLine=4587520;
 //BA.debugLineNum = 4587520;BA.debugLine="Public Sub ContainsKey(Key As String) As Boolean";
B4IRDebugUtils.currentLine=4587521;
 //BA.debugLineNum = 4587521;BA.debugLine="Return Data.ContainsKey(Key)";
if (true) return [__ref->__data /*b4i_b4xorderedmap**/  _containskey /*BOOL*/ :nil :(NSObject*)(_key)];
B4IRDebugUtils.currentLine=4587522;
 //BA.debugLineNum = 4587522;BA.debugLine="End Sub";
return false;
}
- (_b4xcacheitem*)  _createb4xcacheitem:(b4i_b4xcache*) __ref :(NSObject*) _value :(NSString*) _key{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xcache";
if ([B4IDebug shouldDelegate: @"createb4xcacheitem"])
	 {return ((_b4xcacheitem*) [B4IDebug delegate:self.bi :@"createb4xcacheitem::" :@[[B4I nilToNSNull:_value],[B4I nilToNSNull:_key]]]);}
_b4xcacheitem* _t1 = nil;
B4IRDebugUtils.currentLine=4915200;
 //BA.debugLineNum = 4915200;BA.debugLine="Private Sub CreateB4XCacheItem (Value As Object, K";
B4IRDebugUtils.currentLine=4915201;
 //BA.debugLineNum = 4915201;BA.debugLine="Dim t1 As B4XCacheItem";
_t1 = [_b4xcacheitem new];
B4IRDebugUtils.currentLine=4915202;
 //BA.debugLineNum = 4915202;BA.debugLine="t1.Initialize";
[_t1 Initialize];
B4IRDebugUtils.currentLine=4915203;
 //BA.debugLineNum = 4915203;BA.debugLine="t1.Value = Value";
_t1->_Value /*NSObject**/  = _value;
B4IRDebugUtils.currentLine=4915204;
 //BA.debugLineNum = 4915204;BA.debugLine="t1.LastAccessedTime = DateTime.Now";
_t1->_LastAccessedTime /*long long*/  = [[self->___c DateTime] Now];
B4IRDebugUtils.currentLine=4915205;
 //BA.debugLineNum = 4915205;BA.debugLine="t1.Key = Key";
_t1->_Key /*NSString**/  = _key;
B4IRDebugUtils.currentLine=4915206;
 //BA.debugLineNum = 4915206;BA.debugLine="Return t1";
if (true) return _t1;
B4IRDebugUtils.currentLine=4915207;
 //BA.debugLineNum = 4915207;BA.debugLine="End Sub";
return nil;
}
- (NSObject*)  _get:(b4i_b4xcache*) __ref :(NSString*) _key{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xcache";
if ([B4IDebug shouldDelegate: @"get"])
	 {return ((NSObject*) [B4IDebug delegate:self.bi :@"get:" :@[[B4I nilToNSNull:_key]]]);}
_b4xcacheitem* _ci = nil;
B4IRDebugUtils.currentLine=4259840;
 //BA.debugLineNum = 4259840;BA.debugLine="Public Sub Get (Key As String) As Object";
B4IRDebugUtils.currentLine=4259841;
 //BA.debugLineNum = 4259841;BA.debugLine="Dim ci As B4XCacheItem = Data.Get(Key)";
_ci = (_b4xcacheitem*)([__ref->__data /*b4i_b4xorderedmap**/  _get /*NSObject**/ :nil :(NSObject*)(_key)]);
B4IRDebugUtils.currentLine=4259842;
 //BA.debugLineNum = 4259842;BA.debugLine="If ci <> Null Then";
if (_ci!= nil) { 
B4IRDebugUtils.currentLine=4259843;
 //BA.debugLineNum = 4259843;BA.debugLine="If ci.Eternal = False Then ci.LastAccessedTime =";
if (_ci->_Eternal /*BOOL*/ ==false) { 
_ci->_LastAccessedTime /*long long*/  = [[self->___c DateTime] Now];};
B4IRDebugUtils.currentLine=4259844;
 //BA.debugLineNum = 4259844;BA.debugLine="Return ci.Value";
if (true) return _ci->_Value /*NSObject**/ ;
 };
B4IRDebugUtils.currentLine=4259846;
 //BA.debugLineNum = 4259846;BA.debugLine="Return Null";
if (true) return nil;
B4IRDebugUtils.currentLine=4259847;
 //BA.debugLineNum = 4259847;BA.debugLine="End Sub";
return nil;
}
- (int)  _getmaxsize:(b4i_b4xcache*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xcache";
if ([B4IDebug shouldDelegate: @"getmaxsize"])
	 {return ((NSNumber*) [B4IDebug delegate:self.bi :@"getmaxsize" :nil]).intValue;}
B4IRDebugUtils.currentLine=4194304;
 //BA.debugLineNum = 4194304;BA.debugLine="Public Sub getMaxSize As Int";
B4IRDebugUtils.currentLine=4194305;
 //BA.debugLineNum = 4194305;BA.debugLine="Return mMaxSize";
if (true) return __ref->__mmaxsize /*int*/ ;
B4IRDebugUtils.currentLine=4194306;
 //BA.debugLineNum = 4194306;BA.debugLine="End Sub";
return 0;
}
- (NSString*)  _initialize:(b4i_b4xcache*) __ref :(B4I*) _ba{
__ref = self;
[self initializeClassModule];
B4IRDebugUtils.currentModule=@"b4xcache";
if ([B4IDebug shouldDelegate: @"initialize"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"initialize:" :@[[B4I nilToNSNull:_ba]]]);}
B4IRDebugUtils.currentLine=4063232;
 //BA.debugLineNum = 4063232;BA.debugLine="Public Sub Initialize";
B4IRDebugUtils.currentLine=4063233;
 //BA.debugLineNum = 4063233;BA.debugLine="Data.Initialize";
[__ref->__data /*b4i_b4xorderedmap**/  _initialize /*NSString**/ :nil :self.bi];
B4IRDebugUtils.currentLine=4063234;
 //BA.debugLineNum = 4063234;BA.debugLine="End Sub";
return @"";
}
- (BOOL)  _iseternal:(b4i_b4xcache*) __ref :(NSString*) _key{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xcache";
if ([B4IDebug shouldDelegate: @"iseternal"])
	 {return ((NSNumber*) [B4IDebug delegate:self.bi :@"iseternal:" :@[[B4I nilToNSNull:_key]]]).boolValue;}
_b4xcacheitem* _ci = nil;
B4IRDebugUtils.currentLine=4521984;
 //BA.debugLineNum = 4521984;BA.debugLine="Private Sub IsEternal(Key As String) As Boolean";
B4IRDebugUtils.currentLine=4521985;
 //BA.debugLineNum = 4521985;BA.debugLine="Dim ci As B4XCacheItem = Data.Get(Key)";
_ci = (_b4xcacheitem*)([__ref->__data /*b4i_b4xorderedmap**/  _get /*NSObject**/ :nil :(NSObject*)(_key)]);
B4IRDebugUtils.currentLine=4521986;
 //BA.debugLineNum = 4521986;BA.debugLine="Return IIf(ci = Null, False, ci.Eternal)";
if (true) return [self.bi ObjectToBoolean:((_ci== nil) ? ((NSObject*)(@(false))) : ((NSObject*)(@(_ci->_Eternal /*BOOL*/ ))))];
B4IRDebugUtils.currentLine=4521987;
 //BA.debugLineNum = 4521987;BA.debugLine="End Sub";
return false;
}
- (B4IList*)  _keys:(b4i_b4xcache*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xcache";
if ([B4IDebug shouldDelegate: @"keys"])
	 {return ((B4IList*) [B4IDebug delegate:self.bi :@"keys" :nil]);}
B4IRDebugUtils.currentLine=4849664;
 //BA.debugLineNum = 4849664;BA.debugLine="Public Sub Keys As List";
B4IRDebugUtils.currentLine=4849665;
 //BA.debugLineNum = 4849665;BA.debugLine="Return Data.Keys";
if (true) return [__ref->__data /*b4i_b4xorderedmap**/  _getkeys /*B4IList**/ :nil];
B4IRDebugUtils.currentLine=4849666;
 //BA.debugLineNum = 4849666;BA.debugLine="End Sub";
return nil;
}
- (NSObject*)  _put:(b4i_b4xcache*) __ref :(NSString*) _key :(NSObject*) _value{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xcache";
if ([B4IDebug shouldDelegate: @"put"])
	 {return ((NSObject*) [B4IDebug delegate:self.bi :@"put::" :@[[B4I nilToNSNull:_key],[B4I nilToNSNull:_value]]]);}
B4IRDebugUtils.currentLine=4325376;
 //BA.debugLineNum = 4325376;BA.debugLine="Public Sub Put (Key As String, Value As Object) As";
B4IRDebugUtils.currentLine=4325377;
 //BA.debugLineNum = 4325377;BA.debugLine="If IsEternal(Key) Then EternalCounts = EternalCou";
if ([__ref _iseternal /*BOOL*/ :nil :_key]) { 
__ref->__eternalcounts /*int*/  = (int) (__ref->__eternalcounts /*int*/ -1);};
B4IRDebugUtils.currentLine=4325378;
 //BA.debugLineNum = 4325378;BA.debugLine="Data.Put(Key, CreateB4XCacheItem(Value, Key))";
[__ref->__data /*b4i_b4xorderedmap**/  _put /*NSString**/ :nil :(NSObject*)(_key) :(NSObject*)([__ref _createb4xcacheitem /*_b4xcacheitem**/ :nil :_value :_key])];
B4IRDebugUtils.currentLine=4325379;
 //BA.debugLineNum = 4325379;BA.debugLine="TrimIfOversize";
[__ref _trimifoversize /*NSString**/ :nil];
B4IRDebugUtils.currentLine=4325380;
 //BA.debugLineNum = 4325380;BA.debugLine="Return Value";
if (true) return _value;
B4IRDebugUtils.currentLine=4325381;
 //BA.debugLineNum = 4325381;BA.debugLine="End Sub";
return nil;
}
- (NSString*)  _trimifoversize:(b4i_b4xcache*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xcache";
if ([B4IDebug shouldDelegate: @"trimifoversize"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"trimifoversize" :nil]);}
B4IList* _values = nil;
int _numberofitemstoremove = 0;
int _i = 0;
B4IRDebugUtils.currentLine=4653056;
 //BA.debugLineNum = 4653056;BA.debugLine="Private Sub TrimIfOversize";
B4IRDebugUtils.currentLine=4653057;
 //BA.debugLineNum = 4653057;BA.debugLine="If Data.Size - EternalCounts > mMaxSize Then";
if ([__ref->__data /*b4i_b4xorderedmap**/  _getsize /*int*/ :nil]-__ref->__eternalcounts /*int*/ >__ref->__mmaxsize /*int*/ ) { 
B4IRDebugUtils.currentLine=4653058;
 //BA.debugLineNum = 4653058;BA.debugLine="Dim values As List = Data.Values";
_values = [B4IList new];
_values = [__ref->__data /*b4i_b4xorderedmap**/  _getvalues /*B4IList**/ :nil];
B4IRDebugUtils.currentLine=4653059;
 //BA.debugLineNum = 4653059;BA.debugLine="values.SortType(\"LastAccessedTime\", True)";
[_values SortType:@"LastAccessedTime" :true];
B4IRDebugUtils.currentLine=4653060;
 //BA.debugLineNum = 4653060;BA.debugLine="Dim NumberOfItemsToRemove As Int = Ceil(mMaxSize";
_numberofitemstoremove = (int) (ceil(__ref->__mmaxsize /*int*/ *__ref->__removethreshold /*float*/ ));
B4IRDebugUtils.currentLine=4653061;
 //BA.debugLineNum = 4653061;BA.debugLine="For i = 0 To NumberOfItemsToRemove";
{
const int step5 = 1;
const int limit5 = _numberofitemstoremove;
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
B4IRDebugUtils.currentLine=4653062;
 //BA.debugLineNum = 4653062;BA.debugLine="Data.Remove(values.Get(i).As(B4XCacheItem).Key)";
[__ref->__data /*b4i_b4xorderedmap**/  _remove /*NSString**/ :nil :(NSObject*)(((_b4xcacheitem*)([_values Get:_i]))->_Key /*NSString**/ )];
 }
};
 };
B4IRDebugUtils.currentLine=4653065;
 //BA.debugLineNum = 4653065;BA.debugLine="End Sub";
return @"";
}
- (NSObject*)  _puteternal:(b4i_b4xcache*) __ref :(NSString*) _key :(NSObject*) _value{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xcache";
if ([B4IDebug shouldDelegate: @"puteternal"])
	 {return ((NSObject*) [B4IDebug delegate:self.bi :@"puteternal::" :@[[B4I nilToNSNull:_key],[B4I nilToNSNull:_value]]]);}
_b4xcacheitem* _ci = nil;
B4IRDebugUtils.currentLine=4390912;
 //BA.debugLineNum = 4390912;BA.debugLine="Public Sub PutEternal (Key As String, Value As Obj";
B4IRDebugUtils.currentLine=4390913;
 //BA.debugLineNum = 4390913;BA.debugLine="If IsEternal(Key) Then EternalCounts = EternalCou";
if ([__ref _iseternal /*BOOL*/ :nil :_key]) { 
__ref->__eternalcounts /*int*/  = (int) (__ref->__eternalcounts /*int*/ -1);};
B4IRDebugUtils.currentLine=4390914;
 //BA.debugLineNum = 4390914;BA.debugLine="Dim ci As B4XCacheItem = CreateB4XCacheItem(Value";
_ci = [__ref _createb4xcacheitem /*_b4xcacheitem**/ :nil :_value :_key];
B4IRDebugUtils.currentLine=4390915;
 //BA.debugLineNum = 4390915;BA.debugLine="ci.Eternal = True";
_ci->_Eternal /*BOOL*/  = true;
B4IRDebugUtils.currentLine=4390916;
 //BA.debugLineNum = 4390916;BA.debugLine="ci.LastAccessedTime = 9223372036854775807";
_ci->_LastAccessedTime /*long long*/  = (long long) (9223372036854775807L);
B4IRDebugUtils.currentLine=4390917;
 //BA.debugLineNum = 4390917;BA.debugLine="EternalCounts = EternalCounts + 1";
__ref->__eternalcounts /*int*/  = (int) (__ref->__eternalcounts /*int*/ +1);
B4IRDebugUtils.currentLine=4390918;
 //BA.debugLineNum = 4390918;BA.debugLine="Data.Put(Key, ci)";
[__ref->__data /*b4i_b4xorderedmap**/  _put /*NSString**/ :nil :(NSObject*)(_key) :(NSObject*)(_ci)];
B4IRDebugUtils.currentLine=4390919;
 //BA.debugLineNum = 4390919;BA.debugLine="Return Value";
if (true) return _value;
B4IRDebugUtils.currentLine=4390920;
 //BA.debugLineNum = 4390920;BA.debugLine="End Sub";
return nil;
}
- (NSString*)  _remove:(b4i_b4xcache*) __ref :(NSString*) _key{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xcache";
if ([B4IDebug shouldDelegate: @"remove"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"remove:" :@[[B4I nilToNSNull:_key]]]);}
B4IRDebugUtils.currentLine=4456448;
 //BA.debugLineNum = 4456448;BA.debugLine="Public Sub Remove (Key As String)";
B4IRDebugUtils.currentLine=4456449;
 //BA.debugLineNum = 4456449;BA.debugLine="If IsEternal(Key) Then EternalCounts = EternalCou";
if ([__ref _iseternal /*BOOL*/ :nil :_key]) { 
__ref->__eternalcounts /*int*/  = (int) (__ref->__eternalcounts /*int*/ -1);};
B4IRDebugUtils.currentLine=4456450;
 //BA.debugLineNum = 4456450;BA.debugLine="Data.Remove(Key)";
[__ref->__data /*b4i_b4xorderedmap**/  _remove /*NSString**/ :nil :(NSObject*)(_key)];
B4IRDebugUtils.currentLine=4456451;
 //BA.debugLineNum = 4456451;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _removeolditems:(b4i_b4xcache*) __ref :(long long) _agems{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xcache";
if ([B4IDebug shouldDelegate: @"removeolditems"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"removeolditems:" :@[@(_agems)]]);}
B4IList* _values = nil;
long long _level = 0L;
_b4xcacheitem* _ci = nil;
B4IRDebugUtils.currentLine=4718592;
 //BA.debugLineNum = 4718592;BA.debugLine="Public Sub RemoveOldItems (AgeMs As Long)";
B4IRDebugUtils.currentLine=4718593;
 //BA.debugLineNum = 4718593;BA.debugLine="Dim values As List = Data.Values";
_values = [B4IList new];
_values = [__ref->__data /*b4i_b4xorderedmap**/  _getvalues /*B4IList**/ :nil];
B4IRDebugUtils.currentLine=4718594;
 //BA.debugLineNum = 4718594;BA.debugLine="Dim level As Long = DateTime.Now - AgeMs";
_level = (long long) ([[self->___c DateTime] Now]-_agems);
B4IRDebugUtils.currentLine=4718595;
 //BA.debugLineNum = 4718595;BA.debugLine="For Each ci As B4XCacheItem In values";
{
const id<B4IIterable> group3 = _values;
const int groupLen3 = group3.Size
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_ci = (_b4xcacheitem*)([group3 Get:index3]);
B4IRDebugUtils.currentLine=4718596;
 //BA.debugLineNum = 4718596;BA.debugLine="If ci.LastAccessedTime <= level Then";
if (_ci->_LastAccessedTime /*long long*/ <=_level) { 
B4IRDebugUtils.currentLine=4718597;
 //BA.debugLineNum = 4718597;BA.debugLine="Data.Remove(ci.Key)";
[__ref->__data /*b4i_b4xorderedmap**/  _remove /*NSString**/ :nil :(NSObject*)(_ci->_Key /*NSString**/ )];
 };
 }
};
B4IRDebugUtils.currentLine=4718600;
 //BA.debugLineNum = 4718600;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _setmaxsize:(b4i_b4xcache*) __ref :(int) _s{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xcache";
if ([B4IDebug shouldDelegate: @"setmaxsize"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"setmaxsize:" :@[@(_s)]]);}
B4IRDebugUtils.currentLine=4128768;
 //BA.debugLineNum = 4128768;BA.debugLine="Public Sub setMaxSize(s As Int)";
B4IRDebugUtils.currentLine=4128769;
 //BA.debugLineNum = 4128769;BA.debugLine="mMaxSize = s";
__ref->__mmaxsize /*int*/  = _s;
B4IRDebugUtils.currentLine=4128770;
 //BA.debugLineNum = 4128770;BA.debugLine="TrimIfOversize";
[__ref _trimifoversize /*NSString**/ :nil];
B4IRDebugUtils.currentLine=4128771;
 //BA.debugLineNum = 4128771;BA.debugLine="End Sub";
return @"";
}
- (int)  _size:(b4i_b4xcache*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xcache";
if ([B4IDebug shouldDelegate: @"size"])
	 {return ((NSNumber*) [B4IDebug delegate:self.bi :@"size" :nil]).intValue;}
B4IRDebugUtils.currentLine=4784128;
 //BA.debugLineNum = 4784128;BA.debugLine="Public Sub Size As Int";
B4IRDebugUtils.currentLine=4784129;
 //BA.debugLineNum = 4784129;BA.debugLine="Return Data.Size";
if (true) return [__ref->__data /*b4i_b4xorderedmap**/  _getsize /*int*/ :nil];
B4IRDebugUtils.currentLine=4784130;
 //BA.debugLineNum = 4784130;BA.debugLine="End Sub";
return 0;
}
@end