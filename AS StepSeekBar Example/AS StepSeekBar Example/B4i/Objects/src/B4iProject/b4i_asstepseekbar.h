#import "iCore.h"
#import "iXUI.h"
#import "iDebug2.h"
@class b4i_main;
@class b4i_b4xpages;
@class b4i_b4xcollections;
@class b4i_b4xmainpage;
@class _asstepseekbar_step;
@class b4i_b4xbitset;
@class b4i_b4xbytesbuilder;
@class _b4xcacheitem;
@class b4i_b4xcache;
@class b4i_b4xcomparatorsort;
@class b4i_b4xorderedmap;
@class b4i_b4xset;
@class b4i_b4xpagesdelegator;
@class _b4xpageparent;
@class _b4xpageinfo;
@class b4i_b4xpagesmanager;
@interface b4i_asstepseekbar : B4IClass
{
@public NSString* __meventname;
@public NSObject* __mcallback;
@public B4XViewWrapper* __mbase;
@public B4IXUI* __xui;
@public int __reachedlinecolor;
@public int __unreachedlinecolor;
@public int __thumbcolor;
@public B4XCanvas* __cvs;
@public NSObject* __tag;
@public B4XViewWrapper* __touchpanel;
@public int __mvalue;
@public int __minvalue;
@public int __maxvalue;
@public int __interval;
@public BOOL __vertical;
@public int __reachedlinesize;
@public int __unreachedlinesize;
@public int __radius1;
@public int __radius2;
@public BOOL __pressed;
@public int __size;
@public B4IList* __lst_sections;
@public B4IList* __lst_x;
@public B4IList* __lst_y;
@public int __m_index;
@public b4i_main* __main;
@public b4i_b4xpages* __b4xpages;
@public b4i_b4xcollections* __b4xcollections;

}- (NSString*)  _addstep:(b4i_asstepseekbar*) __ref :(int) _color :(NSObject*) _value;
- (NSString*)  _base_resize:(b4i_asstepseekbar*) __ref :(double) _width :(double) _height;
- (NSString*)  _class_globals:(b4i_asstepseekbar*) __ref;
@property (nonatomic)NSString* _meventname;
@property (nonatomic)NSObject* _mcallback;
@property (nonatomic)B4XViewWrapper* _mbase;
@property (nonatomic)B4IXUI* _xui;
@property (nonatomic)int _reachedlinecolor;
@property (nonatomic)int _unreachedlinecolor;
@property (nonatomic)int _thumbcolor;
@property (nonatomic)B4XCanvas* _cvs;
@property (nonatomic)NSObject* _tag;
@property (nonatomic)B4XViewWrapper* _touchpanel;
@property (nonatomic)int _mvalue;
@property (nonatomic)int _minvalue;
@property (nonatomic)int _maxvalue;
@property (nonatomic)int _interval;
@property (nonatomic)BOOL _vertical;
@property (nonatomic)int _reachedlinesize;
@property (nonatomic)int _unreachedlinesize;
@property (nonatomic)int _radius1;
@property (nonatomic)int _radius2;
@property (nonatomic)BOOL _pressed;
@property (nonatomic)int _size;
@property (nonatomic)B4IList* _lst_sections;
@property (nonatomic)B4IList* _lst_x;
@property (nonatomic)B4IList* _lst_y;
@property (nonatomic)int _m_index;
@property (nonatomic)b4i_main* _main;
@property (nonatomic)b4i_b4xpages* _b4xpages;
@property (nonatomic)b4i_b4xcollections* _b4xcollections;
- (NSString*)  _clear:(b4i_asstepseekbar*) __ref;
- (_asstepseekbar_step*)  _createasstepseekbar_step:(b4i_asstepseekbar*) __ref :(NSObject*) _value :(int) _color;
- (NSString*)  _designercreateview:(b4i_asstepseekbar*) __ref :(NSObject*) _base :(B4ILabelWrapper*) _lbl :(B4IMap*) _props;
- (int)  _getsize:(b4i_asstepseekbar*) __ref;
- (int)  _getstepindex:(b4i_asstepseekbar*) __ref;
- (NSObject*)  _getstepvalue:(b4i_asstepseekbar*) __ref :(int) _index;
- (NSString*)  _initialize:(b4i_asstepseekbar*) __ref :(B4I*) _ba :(NSObject*) _callback :(NSString*) _eventname;
- (NSString*)  _raisetouchstateevent:(b4i_asstepseekbar*) __ref;
- (NSString*)  _setstepindex:(b4i_asstepseekbar*) __ref :(int) _index;
- (NSString*)  _setvaluebasedontouch:(b4i_asstepseekbar*) __ref :(int) _x :(int) _y;
- (NSString*)  _touchpanel_touch:(b4i_asstepseekbar*) __ref :(int) _action :(float) _x :(float) _y;
- (NSString*)  _update:(b4i_asstepseekbar*) __ref;
@end
@interface _asstepseekbar_step:NSObject
{
@public BOOL _IsInitialized;
@public NSObject* _Value;
@public int _Color;

}
@property (nonatomic)BOOL IsInitialized;
@property (nonatomic)NSObject* Value;
@property (nonatomic)int Color;
-(void)Initialize;
@end
