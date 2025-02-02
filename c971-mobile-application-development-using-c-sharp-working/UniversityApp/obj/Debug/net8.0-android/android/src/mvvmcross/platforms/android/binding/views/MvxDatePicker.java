package mvvmcross.platforms.android.binding.views;


public class MvxDatePicker
	extends android.widget.DatePicker
	implements
		mono.android.IGCUserPeer,
		android.widget.DatePicker.OnDateChangedListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onDateChanged:(Landroid/widget/DatePicker;III)V:GetOnDateChanged_Landroid_widget_DatePicker_IIIHandler:Android.Widget.DatePicker/IOnDateChangedListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"";
		mono.android.Runtime.register ("MvvmCross.Platforms.Android.Binding.Views.MvxDatePicker, MvvmCross", MvxDatePicker.class, __md_methods);
	}


	public MvxDatePicker (android.content.Context p0, android.util.AttributeSet p1, int p2, int p3)
	{
		super (p0, p1, p2, p3);
		if (getClass () == MvxDatePicker.class) {
			mono.android.TypeManager.Activate ("MvvmCross.Platforms.Android.Binding.Views.MvxDatePicker, MvvmCross", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, System.Private.CoreLib:System.Int32, System.Private.CoreLib", this, new java.lang.Object[] { p0, p1, p2, p3 });
		}
	}


	public MvxDatePicker (android.content.Context p0, android.util.AttributeSet p1, int p2)
	{
		super (p0, p1, p2);
		if (getClass () == MvxDatePicker.class) {
			mono.android.TypeManager.Activate ("MvvmCross.Platforms.Android.Binding.Views.MvxDatePicker, MvvmCross", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, System.Private.CoreLib", this, new java.lang.Object[] { p0, p1, p2 });
		}
	}


	public MvxDatePicker (android.content.Context p0, android.util.AttributeSet p1)
	{
		super (p0, p1);
		if (getClass () == MvxDatePicker.class) {
			mono.android.TypeManager.Activate ("MvvmCross.Platforms.Android.Binding.Views.MvxDatePicker, MvvmCross", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new java.lang.Object[] { p0, p1 });
		}
	}


	public MvxDatePicker (android.content.Context p0)
	{
		super (p0);
		if (getClass () == MvxDatePicker.class) {
			mono.android.TypeManager.Activate ("MvvmCross.Platforms.Android.Binding.Views.MvxDatePicker, MvvmCross", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
		}
	}


	public void onDateChanged (android.widget.DatePicker p0, int p1, int p2, int p3)
	{
		n_onDateChanged (p0, p1, p2, p3);
	}

	private native void n_onDateChanged (android.widget.DatePicker p0, int p1, int p2, int p3);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
