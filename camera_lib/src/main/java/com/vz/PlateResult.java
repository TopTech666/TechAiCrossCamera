package com.vz;

public class PlateResult
{

	//车牌类型
     /*   #define LT_UNKNOWN  0   //未知车牌
		#define LT_BLUE     1   //蓝牌小汽车
		#define LT_BLACK    2   //黑牌小汽车
		#define LT_YELLOW   3   //单排黄牌
		#define LT_YELLOW2  4   //双排黄牌（大车尾牌，农用车）
		#define LT_POLICE   5   //警车车牌
		#define LT_ARMPOL   6   //武警车牌
		#define LT_INDIVI   7   //个性化车牌
		#define LT_ARMY     8   //单排军车牌
		#define LT_ARMY2    9   //双排军车牌
		#define LT_EMBASSY  10  //使馆车牌
		#define LT_HONGKONG 11  //香港进出中国大陆车牌
		#define LT_TRACTOR  12  //农用车牌
		#define LT_COACH	13  //教练车牌
		#define LT_MACAO	14  //澳门进出中国大陆车牌
		#define LT_ARMPOL2   15 //双层武警车牌
		#define LT_ARMPOL_ZONGDUI 16  // 武警总队车牌
		#define LT_ARMPOL2_ZONGDUI 17 // 双层武警总队车牌*/

	public static final String NO_CARNUM = "无";

	public PlateResult() {
	}
	
	   public  byte[] license;  	/**<车牌号码*///GBK
	   public  byte[] color;      		/**<车牌颜色*/
	   public   int nColor;					/**<车牌颜色序号，详见车牌颜色定义LC_X*/
	   public   int nType;					/**<车牌类型，详见车牌类型定义LT_X*/
	    public   int nConfidence;			/**<车牌可信度*/
	    public   int nBright;				/**<亮度评价*/
	    public   int nDirection;				/**<运动方向，详见运动方向定义 DIRECTION_X*/
	    public   THRECT rcLocation; 		/**<车牌位置*/
	    public int nTime;          		/**<识别所用时间*/
	    public   VZ_TIMEVAL tvPTS;			/**<识别时间点*/
	    public    int uBitsTrigType;		/**<强制触发结果的类型,见TH_TRIGGER_TYPE_BIT*/
	     public    char nCarBright;	/**<车的亮度*/
	    public    char nCarColor;	/**<车的颜色，详见车辆颜色定义LCOLOUR_X*/
//	    char reserved0[2];			/**<为了对齐*/
	    public    int uId; 				/**<记录的编号*/
	    public    VzBDTime    struBDTime;     /**<分解时间*/
	   // char reserved[68];			/**<保留*/
	     
	    
	    public static PlateResult createFromData(byte [] data)
	    {
//	    	   Charset cs = Charset.forName ("GBK");
//	    	      ByteBuffer bb = ByteBuffer.allocate (data.length);
//	    	      bb.put (data);
//	    	        bb.flip ();
//	    	       CharBuffer cb = cs.decode (bb);
//	    	       
//	    	   char [] tempData =    cb.array();
	    	
	    	PlateResult pr = new PlateResult();
//	    	int offset = 0 ;
//	    	
//	    	try{
//	    		pr.license = new String(data,0,16,"GBk");
//	    	}
//	    	catch (UnsupportedEncodingException e)
//	    	{
//	    		pr.license = "";
//	    	}
//	    	
//	    	offset += 16;
//	    	try{
//	    	pr.color = new String(data,offset,8,"GBk");
//	        }
//    	   catch (UnsupportedEncodingException e)
//    	   {
//    		   pr.license = "";
//    	   }
//    	
//	    	offset += 8;
//	    	
//	    	try
//	    	{
//	    		pr.nColor =Integer.valueOf( new String(data,offset,4));
//	    	}
//	    	catch (NumberFormatException  e)
//	    	{
//	    		pr.nColor = 0;
//	    	}
//	    	offset += 4;
//	    	
//	    	
//	    	try
//	    	{
//	    		pr.nType =Integer.valueOf( new String(data,offset,4));
//	    	}
//	    	catch (NumberFormatException  e)
//	    	{
//	    		pr.nType = 0;
//	    	}
//	    	offset += 4;
//	    	
//	    	try
//	    	{
//	    		pr.nType =Integer.valueOf( new String(data,offset,4));
//	    	}
//	    	catch (NumberFormatException  e)
//	    	{
//	    		pr.nType = 0;
//	    	}
//	    	offset += 4;
//	    	offset = 92;
//	    	 
//	    	pr. struBDTime = pr.new  VzBDTime();
//	     
//	    	pr. struBDTime.bdt_year =  toInt(data,offset,(int)2);
//	 
//	    	offset += 1;
//	    	
	    	 
	    	
	    	return pr;
	    }
	    
	 // 将byte数组bRefArr转为一个整数,字节数组的低位是整型的低字节位
	    public static int toInt(byte[] bRefArr,int offset,int length) {
	        int iOutcome = 0;
	        byte bLoop;

	        for (int i = offset; i < length; i++) {
	            bLoop = bRefArr[i];
	            iOutcome += (bLoop & 0xFF) << (8 * (i-offset));
	        }
	        return iOutcome;
	    }
	    
	    //System.arraycopy(src, srcPos, dest, destPos, length)
}


 

 