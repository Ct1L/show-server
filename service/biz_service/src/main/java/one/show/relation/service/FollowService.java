/**
 * 
 */
package one.show.relation.service;

import java.util.List;

import one.show.common.exception.ServiceException;
import one.show.relation.domain.Follow;

/**
 * @author zhangwei 2015年8月5日 下午9:01:06
 *
 */
public interface FollowService {
	
	public List<Follow> findListByUid(Long uid, Integer start, Integer count) throws ServiceException;
	
	public void save(Follow follow) throws ServiceException;
	
	public void delete(Long uid, Long fid) throws ServiceException;

	List<Boolean> isFollowed(Long currentUser, List<Long> uids);
	
	List<Boolean> isFans(Long currentUser, List<Long> uids);
	
	public Integer findFollowCountByUid(Long uid) throws ServiceException;
}


