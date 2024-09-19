#import "iCore.h"
#import "iXUI.h"
#import "iDebug2.h"
@class b4i_main;
@class b4i_b4xpages;
@class b4i_b4xcollections;
@class b4i_b4xmainpage;
@class _asstepseekbar_step;
@class b4i_asstepseekbar;
@class b4i_b4xbitset;
@class b4i_b4xbytesbuilder;
@class _b4xcacheitem;
@class b4i_b4xcomparatorsort;
@class b4i_b4xorderedmap;
@class b4i_b4xset;
@class b4i_b4xpagesdelegator;
@class _b4xpageparent;
@class _b4xpageinfo;
@class b4i_b4xpagesmanager;
@interface b4i_b4xcache : B4IClass
{
@public b4i_b4xorderedmap* __data;
@public int __mmaxsize;
@public float __removethreshold;
@public int __eternalcounts;
@public b4i_main* __main;
@public b4i_b4xpages* __b4xpages;
@public b4i_b4xcollections* __b4xcollections;

}- (NSString*)  _class_globals:(b4i_b4xcache*) __ref;
@property (nonatomic)b4i_b4xorderedmap* _data;
@property (nonatomic)int _mmaxsize;
@property (nonatomic)float _removethreshold;
@property (nonatomic)int _eternalcounts;
@property (nonatomic)b4i_main* _main;
@property (nonatomic)b4i_b4xpages* _b4xpages;
@property (nonatomic)b4i_b4xcollections* _b4xcollections;
- (BOOL)  _containskey:(b4i_b4xcache*) __ref :(NSString*) _key;
- (_b4xcacheitem*)  _createb4xcacheitem:(b4i_b4xcache*) __ref :(NSObject*) _value :(NSString*) _key;
- (NSObject*)  _get:(b4i_b4xcache*) __ref :(NSString*) _key;
- (int)  _getmaxsize:(b4i_b4xcache*) __ref;
- (NSString*)  _initialize:(b4i_b4xcache*) __ref :(B4I*) _ba;
- (BOOL)  _iseternal:(b4i_b4xcache*) __ref :(NSString*) _key;
- (B4IList*)  _keys:(b4i_b4xcache*) __ref;
- (NSObject*)  _put:(b4i_b4xcache*) __ref :(NSString*) _key :(NSObject*) _value;
- (NSObject*)  _puteternal:(b4i_b4xcache*) __ref :(NSString*) _key :(NSObject*) _value;
- (NSString*)  _remove:(b4i_b4xcache*) __ref :(NSString*) _key;
- (NSString*)  _removeolditems:(b4i_b4xcache*) __ref :(long long) _agems;
- (NSString*)  _setmaxsize:(b4i_b4xcache*) __ref :(int) _s;
- (int)  _size:(b4i_b4xcache*) __ref;
- (NSString*)  _trimifoversize:(b4i_b4xcache*) __ref;
@end
@interface _b4xcacheitem:NSObject
{
@public BOOL _IsInitialized;
@public NSObject* _Value;
@public long long _LastAccessedTime;
@public NSString* _Key;
@public BOOL _Eternal;

}
@property (nonatomic)BOOL IsInitialized;
@property (nonatomic)NSObject* Value;
@property (nonatomic)long long LastAccessedTime;
@property (nonatomic)NSString* Key;
@property (nonatomic)BOOL Eternal;
-(void)Initialize;
@end
