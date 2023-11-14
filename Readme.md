# Device connectivity API

#Sample Request for Success

{
"ueId": {
"externalId": "123456789@domain.com",
"msisdn": "123456789",
"ipv4Addr": "192.168.0.1/24",
"ipv6Addr": "2001:db8:85a3:8d3:1319:8a2e:370:7344"
},
"uePort": 5060,
"eventType": "UE_ROAMING_STATUS"
}


#Sample Request for errors

{
"ueId": {
"externalId": "123456789@domain.com",
"msisdn": "",
"ipv4Addr": "192.168.0.1/24",
"ipv6Addr": "2001:db8:85a3:8d3:1319:8a2e:370:7344"
},
"uePort": 5060,
"eventType": "UE_ROAMING_STATUS"
}