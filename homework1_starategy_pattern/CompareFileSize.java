package homework1_starategy_pattern;

class CompareFileSize implements Comparable {
	
	@Override
	public boolean myCompareTo(Object obj1, Object obj2) {
		
		FileInfo file1 = (FileInfo)obj1;
		FileInfo file2 = (FileInfo)obj2;
		
		if(file1.getSize() > file2.getSize())
			return true;
		else
			return false;
	}	
}
