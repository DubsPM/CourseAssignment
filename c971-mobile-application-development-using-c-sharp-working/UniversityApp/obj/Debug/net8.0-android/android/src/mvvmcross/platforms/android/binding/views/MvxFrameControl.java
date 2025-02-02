package mvvmcross.platforms.android.binding.views;


public class MvxFrameControl
	extends android.widget.FrameLayout
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onAttachedToWindow:()V:GetOnAttachedToWindowHandler\n" +
			"n_onDetachedFromWindow:()V:GetOnDetachedFromWindowHandler\n" +
			"";
		mono.android.Runtime.register ("MvvmCross.Platforms.Android.Binding.Views.MvxFrameControl, MvvmCross", MvxFrameControl.class, __md_methods);
	}


	public MvxFrameControl (android.content.Context p0, android.util.AttributeSet p1, int p2, int p3)
	{
		super (p0, p1, p2, p3);
		if (getClass () == MvxFrameControl.class) {
			mono.android.TypeManager.Activate ("MvvmCross.Platforms.Android.Binding.Views.MvxFrameControl, MvvmCross", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, System.Private.CoreLib:System.Int32, System.Private.CoreLib", this, new java.lang.Object[] { p0, p1, p2, p3 });
		}
	}


	public MvxFrameControl (android.content.Context p0, android.util.AttributeSet p1, int p2)
	{
		super (p0, p1, p2);
		if (getClass () == MvxFrameControl.class) {
			mono.android.TypeManager.Activate ("MvvmCross.Platforms.Android.Binding.Views.MvxFrameControl, MvvmCross", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, System.Private.CoreLib", this, new java.lang.Object[] { p0, p1, p2 });
		}
	}


	public MvxFrameControl (android.content.Context p0, android.util.AttributeSet p1)
	{
		super (p0, p1);
		if (getClass () == MvxFrameControl.class) {
			mono.android.TypeManager.Activate ("MvvmCross.Platforms.Android.Binding.Views.MvxFrameControl, MvvmCross", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new java.lang.Object[] { p0, p1 });
		}
	}


	public MvxFrameControl (android.content.Context p0)
	{
		super (p0);
		if (getClass () == MvxFrameControl.class) {
			mono.android.TypeManager.Activate ("MvvmCross.Platforms.Android.Binding.Views.MvxFrameControl, MvvmCross", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
		}
	}


	public void onAttachedToWindow ()
	{
		n_onAttachedToWindow ();
	}

	private native void n_onAttachedToWindow ();


	public void onDetachedFromWindow ()
	{
		n_onDetachedFromWindow ();
	}

	private native void n_onDetachedFromWindow ();

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
