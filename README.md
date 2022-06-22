# MyAWS

My AWS

## AWS Global Accelerator

![1655905088254](image/README/1655905088254.png)

![1655905131978](image/README/1655905131978.png)

![1655905172302](image/README/1655905172302.png)

![1655905222081](image/README/1655905222081.png)

![1655905298278](image/README/1655905298278.png)

Listener

Endpoint groups

Application Load Balancers

Network Load Balancers

EC2 Instances

Elastic IP Addresses

![1655905494265](image/README/1655905494265.png)

![1655905476166](image/README/1655905476166.png)

![1655905453982](image/README/1655905453982.png)

![1655905433143](image/README/1655905433143.png)

## AWS Elastic Load Balancer

ELB Types:

- Application Load Balancer (ALB)
- Network Load Balancer (NLB)
- Gateway Load Balancer (GWLB)
- Classic Load Balancer (CLB)

Components:

- Listeners
- Target grpups
- Health checks

ELB Key Points:

- ELB is one of the most the ideal solution for adding elasticity to your application.
- ELB does not have predefined IPv4 addresses, it is resolved using DNS name.
- ELB can manage traffic within a region and not across multiple regions.
- You can specify only one subnet per Availability Zone (AZ).
- ELB has more than one listeners. e.g. HTTP, HTTPS.
- For internet-facing load balancers, the IPv4 addresses of the nodes are assigned by AWS. For internal load balancers, the IPv4 addresses are assigned from the subnet CIDR.
- To ensure that traffic is evenly distributed, you need to ensure the “Cross-Zone Load balancing” option is enabled.

Key Differences:

- Application Load Balancer (as the name implies) works at the Application Layer (Layer 7 of the OSI model, Request level). Network Load Balancer works at Transport layer (Layer 4 of the OSI model, Connection level). NLB just forward requests whereas ALB examines the contents of the HTTP request header to determine where to route the request. So, application load balancer is performing content based routing.
- NLB cannot assure availability of the application. This is because it bases its decisions solely on network and TCP-layer variables and has no awareness of the application at all. Generally a NLB determines availability based on the ability of a server to respond to ICMP ping, or to correctly complete the three-way TCP handshake. ALB goes much deeper, and is capable of determining availability based on not only a successful HTTP GET of a particular page but also the verification that the content is as was expected based on the input parameters.
- When considering the deployment of multiple applications on the same host sharing IP addresses (virtual hosts in old school speak), NLB will not differentiate between Application A and Application B when checking availability (indeed it cannot unless ports are different) but ALB will differentiate between the two applications by examining the application layer data available to it. This difference means that NLB may end up sending requests to an application that has crashed or is offline, but ALB will never make that same mistake.

## ALB vs NLB

![1655907398688](image/README/1655907398688.png)

ALB — Layer 7 (HTTP/HTTPS traffic), Flexible.

NLB — Layer 4 (TLS/TCP/UDP traffic), Static IPs.

CLB — Layer 4/7 (HTTP/TCP/SSL traffic), Legacy, Avoid.

## AWS Application Load Balancer

![1655905598262](image/README/1655905598262.png)

![1655905637170](image/README/1655905637170.png)

![1655905652741](image/README/1655905652741.png)

![1655905673468](image/README/1655905673468.png)

![1655905722674](image/README/1655905722674.png)

![1655905745832](image/README/1655905745832.png)

![1655905756191](image/README/1655905756191.png)

![1655905768043](image/README/1655905768043.png)

![1655905790460](image/README/1655905790460.png)

![1655905822341](image/README/1655905822341.png)

![1655905956636](image/README/1655905956636.png)

![1655906111178](image/README/1655906111178.png)

![1655906135998](image/README/1655906135998.png)

![1655906156193](image/README/1655906156193.png)

![1655906185911](image/README/1655906185911.png)

![1655906198945](image/README/1655906198945.png)

![1655906210196](image/README/1655906210196.png)

![1655906396780](image/README/1655906396780.png)

## AWS Network Load Balancer

![1655906621502](image/README/1655906621502.png)

![1655907056647](image/README/1655907056647.png)

![1655907108808](image/README/1655907108808.png)

![1655907152198](image/README/1655907152198.png)

![1655907164499](image/README/1655907164499.png)

![1655907196631](image/README/1655907196631.png)

![1655907256669](image/README/1655907256669.png)

## AWS Certified Cloud Practitioner

![1655575619582](image/README/1655575619582.png)

![1655575644262](image/README/1655575644262.png)

![1655571566185](image/README/1655571566185.png)

![1655575597765](image/README/1655575597765.png)

![1655588128844](image/README/1655588128844.png)

![1655588147324](image/README/1655588147324.png)

![1655588182620](image/README/1655588182620.png)

![1655589425808](image/README/1655589425808.png)

![1655591971072](image/README/1655591971072.png)

![1655592599836](image/README/1655592599836.png)

![1655592688435](image/README/1655592688435.png)

![1655592923634](image/README/1655592923634.png)

![1655593055133](image/README/1655593055133.png)

![1655593256414](image/README/1655593256414.png)

![1655593356556](image/README/1655593356556.png)

![1655593491887](image/README/1655593491887.png)

![1655593520486](image/README/1655593520486.png)

![1655637314432](image/README/1655637314432.png)

![1655637354023](image/README/1655637354023.png)

![1655637478422](image/README/1655637478422.png)

![1655637573431](image/README/1655637573431.png)

![1655637618736](image/README/1655637618736.png)

![1655637661821](image/README/1655637661821.png)

![1655637731350](image/README/1655637731350.png)

![1655637788832](image/README/1655637788832.png)

![1655637829962](image/README/1655637829962.png)

![1655637893888](image/README/1655637893888.png)

![1655637932070](image/README/1655637932070.png)

![1655637964263](image/README/1655637964263.png)

![1655638139209](image/README/1655638139209.png)

![1655638189807](image/README/1655638189807.png)

![1655638359186](image/README/1655638359186.png)

![1655638397116](image/README/1655638397116.png)

## AWS intro

![](image/README/001.png)

![](image/README/002.png)

![](image/README/003.png)

![](image/README/004.png)

![](image/README/005.png)

![](image/README/006.png)

![](image/README/007.png)

![](image/README/008.png)

![](image/README/009.png)

![](image/README/010.png)

![](image/README/011.png)

![](image/README/012.png)

![](image/README/013.png)

![](image/README/014.png)

![](image/README/015.png)

![](image/README/016.png)

![](image/README/017.png)

![](image/README/018.png)

## AWS questions

### AWS cloud formation

What are the steps involved in a CloudFormation Solution?

- Create or use an existing CloudFormation template using JSON or YAML format.
- Save the code in an S3 bucket, which serves as a repository for the code.
- Use AWS CloudFormation to call the bucket and create a stack on your template.
- CloudFormation reads the file and understands the services that are called, their order, the relationship between the services, and provisions the services one after the other.

AWS CloudFormation provides users with a simple way to create and manage a collection of Amazon Web Services (AWS) resources by provisioning and updating them in a predictable way. AWS CloudFormation enables you to manage your complete infrastructure or AWS resources in a text file.

AWS CloudFormation enables you to manage your complete infrastructure or AWS resources in a text file, or template. A collection of AWS resources is called a stack. AWS resources can be created or updated by using a stack.

All the resources you require in an application can be deployed easily using templates. Also, you can reuse your templates to replicate your infrastructure in multiple environments. To make templates reusable, use the parameters, mappings and conditions sections in the template so that you can customize your stacks when you create them.

An AWS CloudFormation template is a formatted text file in JSON or YAML language that describes your AWS infrastructure. To create, view and modify templates, you can use AWS CloudFormation Designer or any text editor tool. An AWS CloudFormation template consists of nine main objects:

1. Format version: Format version defines the capability of a template.

2. Description: Any comments about your template can be specified in the description.

3. Metadata: Metadata can be used in the template to provide further information using JSON or YAML objects.

4. Parameters: Templates can be customized using parameters. Each time you create or update your stack, parameters help you give your template custom values at runtime.

5. Mappings: Mapping enables you to map keys to a corresponding named value that you specify in a conditional parameter. Also, you can retrieve values in a map by using the “Fn:: FindInMap” intrinsic function.

6. Conditions: In a template, conditions define whether certain resources are created or when resource properties are assigned to a value during stack creation or updating. Conditions can be used when you want to reuse the templates by creating resources in different contexts. You can use intrinsic functions to define conditions.

In a template, during stack creation, all the conditions in your template are evaluated. Any resources that are associated with a true condition are created, and the invalid conditions are ignored automatically.

7. Transform: Transform builds a simple declarative language for AWS CloudFormation and enables reuse of template components. Here, you can declare a single transform or multiple transforms within a template.

8. Resources: Using this section, you can declare the AWS resource that you want to create and specify in the stack, such as an Amazon S3 bucket or AWS Lambda.

9. Output: In a template, the output section describes the output values that you can import into other stacks or the values that are returned when you view your own stack properties. For example, for an S3 bucket name, you can declare an output and use the “Description-stacks” command from the AWS CloudFormation service to make the bucket name easier to find.

### AWS CloudFormation vs AWS Elastic Beanstalk

AWS CloudFormation helps you provision and describe all of the infrastructure resources that are present in your cloud environment. On the other hand, AWS Elastic Beanstalk provides an environment that makes it easy to deploy and run applications in the cloud.

AWS CloudFormation supports the infrastructure needs of various types of applications, like legacy applications and existing enterprise applications. On the other hand, AWS Elastic Beanstalk is combined with the developer tools to help you manage the lifecycle of your applications.

### What happens when one of the resources in a stack cannot be created successfully by Cloud Formation?

If the resource in the stack cannot be created, then the CloudFormation automatically rolls back and terminates all the resources that were created in the CloudFormation template. This is a handy feature when you accidentally exceed your limit of Elastic IP addresses or don’t have access to an EC2 AMI.

### How to log into the cloud environment other than console?

- Putty
- AWS CLI for Linux
- AWS CLI for Windows
- AWS CLI for Windows CMD
- AWS SDK
- Eclipse

### What AWS services can be used to create a centralized logging solution?

The essential services that you can use are Amazon CloudWatch Logs, store them in Amazon S3, and then use Amazon Elastic Search to visualize them.

You can use Amazon Kinesis Firehose to move the data from Amazon S3 to Amazon ElasticSearch.

### Name some of the AWS services that are not region-specific

AWS services that are not region-specific are:

- IAM
- Route 53
- Web Application Firewall
- CloudFront

### Stopping vs Terminating an EC2 instance

While you may think that both stopping and terminating are the same, there is a difference. When you stop an EC2 instance, it performs a normal shutdown on the instance and moves to a stopped state.

When you terminate the instance, it is transferred to a stopped state, and the EBS volumes attached to it are deleted and can never be recovered.

### How to configure CloudWatch to recover an EC2 instance?

- Create an Alarm using Amazon CloudWatch
- In the Alarm, go to Define Alarm -> Actions tab
- Choose Recover this instance option

### How to recover/login to an EC2 instance if the key has been lost?

- Verify that the EC2Config service is running
- Detach the root volume for the instance
- Attach the volume to a temporary instance
- Modify the configuration file
- Restart the original instance

### Differences between AWS S3 and EBS

![](image/README/S3_vs_EBS.png)

Amazon Elastic Block Store (Amazon EBS) provides block level storage volumes for use with EC2 instances. EBS volumes behave like raw, unformatted block devices. You can mount these volumes as devices on your instances.

### How to monitor Amazon VPC?

- CloudWatch and CloudWatch logs
- VPC Flow Logs

### How many Subnets can you have per VPC?

We can have up to 200 Subnets per Amazon Virtual Private Cloud (VPC).

### How can you add an existing instance to a new Auto Scaling group?

- Open EC2 console
- Select your instance under Instances
- Choose Actions -> Instance Settings -> Attach to Auto Scaling Group
- Select a new Auto Scaling group
- Attach this group to the Instance
- Edit the Instance if needed
- Once done, you can successfully add the instance to a new Auto Scaling group

### RTO and RPO in AWS?

RTO or Recovery Time Objective is the maximum time your business or organization is willing to wait for a recovery to complete in the wake of an outage.

RPO or Recovery Point Objective is the maximum amount of data loss your company is willing to accept as measured in time.

### Connection Draining

Connection Draining is an AWS service that allows us to serve current requests on the servers that are either being decommissioned or updated.

By enabling this Connection Draining, we let the Load Balancer make an outgoing instance finish its existing requests for a set length of time before sending it any new requests. A departing instance will immediately go off if Connection Draining is not enabled, and all pending requests will fail.

### How can you use AWS WAF in monitoring your AWS applications?

AWS WAF or AWS Web Application Firewall protects your web applications from web exploitations. It helps you control the traffic flow to your applications.

With WAF, you can also create custom rules that block common attack patterns. It can be used for three cases: allow all requests, prevent all requests, and count all requests for a new policy.

### IAM role vs IAM user

The two key differences between the IAM role and IAM user are:

- An IAM role is an IAM entity that defines a set of permissions for making AWS service requests, while an IAM user has permanent long-term credentials and is used to interact with the AWS services directly.

- In the IAM role, trusted entities, like IAM users, applications, or an AWS service, assume roles whereas the IAM user has full access to all the AWS IAM functionalities.
