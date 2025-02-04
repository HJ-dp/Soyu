import { useState, useEffect } from 'react';
import { getHistoryList } from '../api/apis';

/** 판매내역 리스트 */
function useHistoryList() {
  const [data, setData] = useState('');
  useEffect(() => {
    getHistoryList().then((response) => {
      const result = response.data.data;
      setData(result);
    });
  }, []);
  return data;
}
export default useHistoryList;
