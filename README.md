# MyAWS

My AWS

## My AWS projects

### Project 3

Created a progressive web application and deployed to AWS for a federal client

- Built a new web application with React, TypeScript, Material UI, Router, i18n, axios, formik, lodash and S3 on front end, Node.js, Redis, winston, dotenv, AWS Lambda functions, Amazon API Gateway, Aurora PostgreSQL on back end.
- Managed the database schema changes, version controls and automated deployment scripts with Liquibase.
- Used CI/CD pipelines for different projects with AWS CloudFormation, CloudBuild, CodeCommit, CodePipeline and Azure DevOps.

### Project 2

Modernized an on premise application built with C# .Net and MS SQL Server to AWS cloud with Amazon Relational Database Service for a bank client

- Installed and configured AWS Toolkit for Visual Studio.
- Switched on premise MS SQL Server to AWS RDS.
- Scaled performance with asynchronous messaging.
- Published ASP .NET Core application to AWS Elastic Beanstalk.
- Added Docker support to ASP .NET application.
- Packaged .NET application in Docker using MSIs.
- Deployed to Docker containers Fargate.
- Ensured containers’ Load Balancer can access RDS instance.

### Project 1

Migrated an on premise Cassandra to DynamoDB with AWS DMS for an insurance client

- Used AWS Schema Conversion Tool Clone Data Center wizard to add a new Cassandra data center and replicated data.
- Converted Cassandra tables to DynamoDB structures with SCT.
- Created SCT data extract tasks, programmed custom Data Extractors with Java.
- Configured the IAM role and attached permission policy.
- Installed and configured SCT data extracting agents.
- Dumped encrypted data with the agents.
- Converted .csv files to appropriate formats.
- Uploaded to AWS S3 bucket.
- Loaded to AWS DynamoDB with AWS Data Migration Service.

## Learn AWS

[Learn AWS](LearnAWS.md)

## My AWS solutions

### How to find the closest supported region

Use `CloudPing.co`

### How to use AWS Lamda

[How to use AWS Lambda](AWS_Lambda.md)

### How to deploy an React app to AWS

[How to deploy an React app to AWS](Deploy_React_2_AWS.md)

## Misc

### Amazon Elastic Container Service (Amazon ECS)

- How it works

Amazon ECS is a fully managed container orchestration service that makes it easy for you to deploy, manage, and scale containerized applications.

![1672328695734](image/README/1672328695734.png)

- Use cases

  - Deploy in a hybrid environment

  Build container-based applications on-premises or in the cloud with Amazon ECS Anywhere and enjoy consistent tooling, management, workload scheduling, and monitoring across environments.

  - Support batch processing

  Plan, schedule, and execute batch computing workloads across the full range of AWS services, including Amazon Elastic Compute Cloud (EC2), Fargate, and Amazon EC2 Spot Instances.

  - Scale web applications

  Automatically scale and run web applications in multiple Availability Zones with the performance, scale, reliability, and availability of AWS.

### Amazon Elastic Container Registry (Amazon ECR)

- How it works

Amazon ECR is a fully managed container registry offering high-performance hosting, so you can reliably deploy application images and artifacts anywhere.

- Use cases

  - Manage software vulnerabilities

    Meet your image compliance security requirements using the tightly integrated Amazon Inspector vulnerability management service to automate vulnerability assessment scanning and remediation ticket routing.

  - Streamline your deployment workloads

    Publish containerized applications with a single command and easily integrate your self-managed environments.

  - Manage image lifecycle policies

    Automatically preserve the most recent images and archive ones you don’t need. Use rules and tagging to access images quickly.

### AWS Elastic Beanstalk

- Why AWS Elastic Beanstalk?

Elastic Beanstalk is a service for deploying and scaling web applications and services. Upload your code and Elastic Beanstalk automatically handles the deployment—from capacity provisioning, load balancing, and auto scaling to application health monitoring.

- Use cases

  - Quickly launch web applications

  Deploy scalable web applications in minutes without the complexity of provisioning and managing underlying infrastructure.

  - Create mobile API backends for your applications

  Use your favorite programming language to build mobile API backends, and Elastic Beanstalk will manage patches and updates.

  - Replatform critical business applications

  Migrate stateful applications off legacy infrastructure to Elastic Beanstalk and connect securely to your private network.

### Amazon Rekognition Video

You can use Amazon Rekognition Video to detect and recognize faces or detect objects in streaming video. Amazon Rekognition Video uses Amazon Kinesis Video Streams to receive and process a video stream. You create a stream processor with parameters that show what you want the stream processor to detect from the video stream. Rekognition sends label detection results from streaming video events as Amazon SNS and Amazon S3 notifications. Rekognition outputs face search results to a Kinesis data stream.

![1672198765593](image/README/1672198765593.png)

![1672198793539](image/README/1672198793539.png)
