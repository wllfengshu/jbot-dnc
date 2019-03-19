# TUser管理


## 一、数据字典

注：PRI主键约束;UNI唯一约束;MUL可以重复

| 编号 | 字段名 | 类型 | 是否允许空 | 约束 | 含义 | 备注 |
| ---- | ---- | ---- | ---- | ---- | ---- | ---- |
 | 1 | id | int(11) | NO | PRI | ID |  |
 | 2 | username | varchar(64) | NO | PRI | 用户名 |  |
 | 3 | password | varchar(255) | YES |  |  |  |
 | 4 | create_time | datetime | YES |  |  |  |
 | 5 | update_time | datetime | YES |  |  |  |
 | 6 | delete_time | datetime | YES |  |  |  |
 | 7 | is_delete | int(1) | YES |  |  |  |

## 二、接口文档
### 1 增加

`POST model/tUsers/tUser`

#### 1.1 请求参数

| 参数名 | 类型 | 是否允许空 | 位置 | 描述 | 举例 | 备注 |
| ---- | ---- | ---- | ---- | ---- | ---- | ---- |
| sessionId | string | 否 | header | SessionID | 2ab321c6-8869-4d20-a2d5-35e930e08132 |
| entity | json | 否 | body | 实体类 |  |  |

#### 1.2 响应参数

| 参数名 | 类型 | 是否允许空 | 描述 | 备注 |
| ---- | ---- | ---- | ---- | ---- |
#### 1.3 请求响应示例

```
POST http://127.0.0.1:8080/dnc/tUsers/tUser
```

- (1) 请求头：request headers

```
sessionId: d56006cc-a698-437c-a580-6fcb8e86cc62
Content-Type: application/json;charset=utf-8
```

- (2) request payload

```json
{
	"id" : 0,
	"username" : "string",
	"password" : "string",
	"create_time" : "2019-01-01 00:00:00",
	"update_time" : "2019-01-01 00:00:00",
	"delete_time" : "2019-01-01 00:00:00",
	"is_delete" : 0
}
```

- (3) response

```json

```

#### 1.4 异常示例

```json
{
	"errorMessage": "没有权限",
	"errorCode": 14001,
	"instanceId": "dnc-xyzws"
}
```

#### 1.5 业务错误码

| 错误码 | 描述 | 解决方案 |
| ---- | ---- | ---- |
| 14001 | 没有权限 | 检查该用户的权限 |


<br/><br/>
### 2 删除

`DELETE dnc/tUsers/tUser/{id}`

#### 2.1 请求参数

| 参数名 | 类型 | 是否允许空 | 位置 | 描述 | 举例 | 备注 |
| ---- | ---- | ---- | ---- | ---- | ---- | ---- |
| sessionId | string | 否 | header | SessionID | 2ab321c6-8869-4d20-a2d5-35e930e08132 |
| id | Integer | 否 | path | id | 1 |  |

#### 2.2 响应参数

| 参数名 | 类型 | 是否允许空 | 描述 | 备注 |
| ---- | ---- | ---- | ---- | ---- |
#### 2.3 请求响应示例

```
DELETE http://127.0.0.1:8080/dnc/tUsers/tUser/1
```

- (1) 请求头：request headers

```
sessionId: d56006cc-a698-437c-a580-6fcb8e86cc62
Content-Type: application/json;charset=utf-8
```

- (2) request payload

```json

```

- (3) response

```json

```

#### 2.4 异常示例

```json
{
	"errorMessage": "没有权限",
	"errorCode": 14001,
	"instanceId": "dnc-xyzws"
}
```

#### 2.5 业务错误码

| 错误码 | 描述 | 解决方案 |
| ---- | ---- | ---- |
| 14001 | 没有权限 | 检查该用户的权限 |


<br/><br/>
### 3 修改

`PUT dnc/tUsers/tUser`

#### 3.1 请求参数

| 参数名 | 类型 | 是否允许空 | 位置 | 描述 | 举例 | 备注 |
| ---- | ---- | ---- | ---- | ---- | ---- | ---- |
| sessionId | string | 否 | header | SessionID | 2ab321c6-8869-4d20-a2d5-35e930e08132 |
| entity | json | 否 | body | 实体类 |  |  |

#### 3.2 响应参数

| 参数名 | 类型 | 是否允许空 | 描述 | 备注 |
| ---- | ---- | ---- | ---- | ---- |
#### 3.3 请求响应示例

```
PUT http://127.0.0.1:8080/dnc/tUsers/tUser
```

- (1) 请求头：request headers

```
sessionId: d56006cc-a698-437c-a580-6fcb8e86cc62
Content-Type: application/json;charset=utf-8
```

- (2) request payload

```json
{
	"id" : 0,
	"username" : "string",
	"password" : "string",
	"create_time" : "2019-01-01 00:00:00",
	"update_time" : "2019-01-01 00:00:00",
	"delete_time" : "2019-01-01 00:00:00",
	"is_delete" : 0
}
```

- (3) response

```json

```

#### 3.4 异常示例

```json
{
	"errorMessage": "没有权限",
	"errorCode": 14001,
	"instanceId": "dnc-xyzws"
}
```

#### 3.5 业务错误码

| 错误码 | 描述 | 解决方案 |
| ---- | ---- | ---- |
| 14001 | 没有权限 | 检查该用户的权限 |


<br/><br/>
### 4 通过ID查询

`GET dnc/tUsers/tUser/{id}`

#### 4.1 请求参数

| 参数名 | 类型 | 是否允许空 | 位置 | 描述 | 举例 | 备注 |
| ---- | ---- | ---- | ---- | ---- | ---- | ---- |
| sessionId | string | 否 | header | SessionID | 2ab321c6-8869-4d20-a2d5-35e930e08132 |
| id | Integer | 否 | path | id | 1 |  |

#### 4.2 响应参数

| 参数名 | 类型 | 是否允许空 | 描述 | 备注 |
| ---- | ---- | ---- | ---- | ---- |
| id | Integer | NO | ID |  |
| username | String | NO | 用户名 |  |
| password | String | YES |  |  |
| create_time | Date | YES |  |  |
| update_time | Date | YES |  |  |
| delete_time | Date | YES |  |  |
| is_delete | Integer | YES |  |  |
#### 4.3 请求响应示例

```
GET http://127.0.0.1:8080/dnc/tUsers/tUser/1
```

- (1) 请求头：request headers

```
sessionId: d56006cc-a698-437c-a580-6fcb8e86cc62
Content-Type: application/json;charset=utf-8
```

- (2) request payload

```json

```

- (3) response

```json
{
	"id" : 0,
	"username" : "string",
	"password" : "string",
	"create_time" : "2019-01-01 00:00:00",
	"update_time" : "2019-01-01 00:00:00",
	"delete_time" : "2019-01-01 00:00:00",
	"is_delete" : 0
}
```

#### 4.4 异常示例

```json
{
	"errorMessage": "没有权限",
	"errorCode": 14001,
	"instanceId": "dnc-xyzws"
}
```

#### 4.5 业务错误码

| 错误码 | 描述 | 解决方案 |
| ---- | ---- | ---- |
| 14001 | 没有权限 | 检查该用户的权限 |


<br/><br/>
### 5 查询

`GET dnc/tUsers`

#### 5.1 请求参数

| 参数名 | 类型 | 是否允许空 | 位置 | 描述 | 举例 | 备注 |
| ---- | ---- | ---- | ---- | ---- | ---- | ---- |
| sessionId | string | 否 | header | SessionID | 2ab321c6-8869-4d20-a2d5-35e930e08132 |
| pageNo | int | 是 | query | 页码 | 0 | 从0开始,默认为0 |
| pageSize | int | 是 | query | 页面大小 | 10 | 默认为10 |

#### 5.2 响应参数

| 参数名 | 类型 | 是否允许空 | 描述 | 备注 |
| ---- | ---- | ---- | ---- | ---- |
| id | Integer | NO | ID |  |
| username | String | NO | 用户名 |  |
| password | String | YES |  |  |
| create_time | Date | YES |  |  |
| update_time | Date | YES |  |  |
| delete_time | Date | YES |  |  |
| is_delete | Integer | YES |  |  |
#### 5.3 请求响应示例

```
GET http://127.0.0.1:8080/dnc/tUsers
```

- (1) 请求头：request headers

```
sessionId: d56006cc-a698-437c-a580-6fcb8e86cc62
Content-Type: application/json;charset=utf-8
```

- (2) request payload

```json

```

- (3) response

```json
{
	"total": 1,
	"data": [
		{
			"id" : 0,
			"username" : "string",
			"password" : "string",
			"create_time" : "2019-01-01 00:00:00",
			"update_time" : "2019-01-01 00:00:00",
			"delete_time" : "2019-01-01 00:00:00",
			"is_delete" : 0
		}
	]
}
```

#### 4.4 异常示例

```json
{
	"errorMessage": "没有权限",
	"errorCode": 14001,
	"instanceId": "dnc-xyzws"
}
```

#### 4.5 业务错误码

| 错误码 | 描述 | 解决方案 |
| ---- | ---- | ---- |
| 14001 | 没有权限 | 检查该用户的权限 |


<br/><br/>

<br/><br/>
