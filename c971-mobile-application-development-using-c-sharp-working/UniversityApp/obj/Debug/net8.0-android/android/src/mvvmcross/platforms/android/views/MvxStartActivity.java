package mvvmcross.platforms.android.views;


public abstract class MvxStartActivity
	extends mvvmcross.platforms.android.views.MvxActivity
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onCreate:(Landroid/os/Bundle;)V:GetOnCreate_Landroid_os_Bundle_Handler\n" +
			"n_onResume:()V:GetOnResumeHandler\n" +
			"";
		mono.android.Runtime.register ("MvvmCross.Platforms.Android.Views.MvxStartActivity, MvvmCross", MvxStartActivity.class, __md_methods);
	}


	public MvxStartActivity ()
	{
		super ();
		if (getClass () == MvxStartActivity.class) {
			mono.android.TypeManager.Activate ("MvvmCross.Platforms.Android.Views.MvxStartActivity, MvvmCross", "", this, new java.lang.Object[] {  });
		}
	}


	public MvxStartActivity (int p0)
	{
		super (p0);
		if (getClass () == MvxStartActivity.class) {
			mono.android.TypeManager.Activate ("MvvmCross.Platforms.Android.Views.MvxStartActivity, MvvmCross", "System.Int32, System.Private.CoreLib", this, new java.lang.Object[] { p0 });
		}
	}


	public void onCreate (android.os.Bundle p0)
	{
		n_onCreate (p0);
	}

	private native void n_onCreate (android.os.Bundle p0);


	public void onResume ()
	{
		n_onResume ();
	}

	private native void n_onResume ();

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
