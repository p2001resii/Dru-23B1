package Tasks5thmay;

public class Tv implements Tv_Remote,Smart_TvRemote{

	@Override
	public void oldTvRemote() {
		System.out.println("OLD TV REMOTE");
	}
	@Override
	public void smartTvRemote() {
		System.out.println("JUST SMART TV REMOTE");

	}

	public static void main(String[] args) {

		Tv oldtv=new Tv();

		oldtv.oldTvRemote();

		Tv Newtv=new Tv();
		Newtv.smartTvRemote();


	}

}
