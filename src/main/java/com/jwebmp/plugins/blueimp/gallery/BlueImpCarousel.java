package com.jwebmp.plugins.blueimp.gallery;

public class BlueImpCarousel<J extends BlueImpCarousel<J>>
		extends BlueImpGallery<J>
{
	public BlueImpCarousel()
	{
		addClass(BlueImpGalleryClasses.BlueImp_Gallery_Carousel);
	}

	@Override
	public void preConfigure()
	{
		super.preConfigure();
		getChildren().remove(super.getClose());
	}
}
