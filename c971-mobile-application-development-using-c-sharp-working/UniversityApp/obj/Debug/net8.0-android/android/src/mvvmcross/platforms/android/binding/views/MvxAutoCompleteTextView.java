package mvvmcross.platforms.android.binding.views;


public class MvxAutoCompleteTextView
	extends android.widget.AutoCompleteTextView
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("MvvmCross.Platforms.Android.Binding.Views.MvxAutoCompleteTextView, MvvmCross", MvxAutoCompleteTextView.class, __md_methods);
	}


	public MvxAutoCompleteTextView (android.content.Context p0, android.util.AttributeSet p1, int p2, int p3, android.content.res.Resources.Theme p4)
	{
		super (p0, p1, p2, p3, p4);
		if (getClass () == MvxAutoCompleteTextView.class) {
			mono.android.TypeManager.Activate ("MvvmCross.Platforms.Android.Binding.Views.MvxAutoCompleteTextView, MvvmCross", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, System.Private.CoreLib:System.Int32, System.Private.CoreLib:Android.Content.Res.Resources+Theme, Mono.Android", this, new java.lang.Object[] { p0, p1, p2, p3, p4 });
		}
	}


	public MvxAutoCompleteTextView (android.content.Context p0, android.util.AttributeSet p1, int p2, int p3)
	{
		super (p0, p1, p2, p3);
		if (getClass () == MvxAutoCompleteTextView.class) {
			mono.android.TypeManager.Activate ("MvvmCross.Platforms.Android.Binding.Views.MvxAutoCompleteTextView, MvvmCross", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, System.Private.CoreLib:System.Int32, System.Private.CoreLib", this, new java.lang.Object[] { p0, p1, p2, p3 });
		}
	}


	public MvxAutoCompleteTextView (android.content.Context p0, android.util.AttributeSet p1, int p2)
	{
		super (p0, p1, p2);
		if (getClass () == MvxAutoCompleteTextView.class) {
			mono.android.TypeManager.Activate ("MvvmCross.Platforms.Android.Binding.Views.MvxAutoCompleteTextView, MvvmCross", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, System.Private.CoreLib", this, new java.lang.Object[] { p0, p1, p2 });
		}
	}


	public MvxAutoCompleteTextView (android.content.Context p0, android.util.AttributeSet p1)
	{
		super (p0, p1);
		if (getClass () == MvxAutoCompleteTextView.class) {
			mono.android.TypeManager.Activate ("MvvmCross.Platforms.Android.Binding.Views.MvxAutoCompleteTextView, MvvmCross", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new java.lang.Object[] { p0, p1 });
		}
	}


	public MvxAutoCompleteTextView (android.content.Context p0)
	{
		super (p0);
		if (getClass () == MvxAutoCompleteTextView.class) {
			mono.android.TypeManager.Activate ("MvvmCross.Platforms.Android.Binding.Views.MvxAutoCompleteTextView, MvvmCross", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
		}
	}

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
