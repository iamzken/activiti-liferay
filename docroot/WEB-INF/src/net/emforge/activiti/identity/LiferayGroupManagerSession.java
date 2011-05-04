package net.emforge.activiti.identity;

import java.util.List;

import org.activiti.engine.identity.Group;
import org.activiti.engine.identity.GroupQuery;
import org.activiti.engine.impl.Page;
import org.activiti.engine.impl.persistence.entity.GroupEntity;
import org.activiti.engine.impl.persistence.entity.GroupManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

public class LiferayGroupManagerSession extends GroupManager {
	
	private static Log _log = LogFactoryUtil.getLog(LiferayGroupManagerSession.class);

	private LiferayIdentityService liferayIdentityService = new LiferayIdentityService();
	
	@Override
	public Group createNewGroup(String groupId) {
		_log.error("Method is not implemented"); // TODO
		return null;
	}
	
	@Override
	public void insertGroup(Group group) {
		_log.error("Method is not implemented"); // TODO
		
	}
	
	@Override
	public void updateGroup(Group updatedGroup) {
		_log.error("Method is not implemented"); // TODO
		
	}

	@Override
	public void deleteGroup(String groupId) {
		_log.error("Method is not implemented"); // TODO
	}
	
	@Override
	public GroupQuery createNewGroupQuery() {
		_log.error("Method is not implemented"); // TODO
		return null;
	}
	
	@Override
	public List<Group> findGroupByQueryCriteria(Object query, Page page) {
		_log.error("Method is not implemented"); // TODO
		return null;
	}

	@Override
	public long findGroupCountByQueryCriteria(Object query) {
		_log.error("Method is not implemented"); // TODO
		return -1;
	}
	
	@Override
	public GroupEntity findGroupById(String groupId) {
		_log.error("Method is not implemented"); // TODO
		return null;
	}
	
	@Override
	public List<Group> findGroupsByUser(String userId) {
		return liferayIdentityService.findGroupsByUser(userId);
	}

}