
# How to deploy an React app to AWS

## How to deploy React app to AWS ECR+EC2+ECS with docker (recommended)

- React part
  - Create React app
    Route, i18n, use hooks, promises etc.
  - Build backend APIs with Java, Node.js, python etc.

- Docker part
  - Create a Dockerfile
    Use ngix to serve the static files

- AWS part
  - AWS CLI
    - install
    - config
  - AWS ECR
    - Create a new repository (private)
    - Push command with AWS CLI
  - AWS EC2
    - Load balancer
      - Application Load Balancer
        - VPC
        - Security Group
        - Routing
  - AWS ECS
    - Task Definition
    - Add Container
      - Image (URI of the ECR repository)
      - Memory limits
      - Port mappings
      - Login configuration
    - Cluster
      - EC2 instance type
      - Networking (VPC, security group etc.)
    - Create service
      - Launch type: EC2
      - Load Balancing
  - Verify
    - EC2 -> Load Balancers -> DNS name
    - Check in browser

## How to deploy React app to AWS EC2 (not recommended)

- React part
  - Create React app
    Route, i18n, use hooks, promises etc.
  - Build backend APIs with Java, Node.js, python etc.

- AWS part
  - AWS EC2
    - Instance type
    - Security group
      - HTTP
      - HTTPS
    - Key pair
    - Launch
      - Public IP
      - Private IP
    - Connect with SSH
      - install nodejs
      - git clone
      - npm i
      - forever start app.js

## How to deploy React app to AWS S3 (not recommended)

- React part
  - Create React app
    Route, i18n, use hooks, promises etc.
  - Build backend APIs with Java, Node.js, python etc.
  - Generate static HTML pages with react-snapshot or react-snap.

    `"build": "react-scripts build && react-snapshot"`

    `npm build`

- AWS part
  - RDS (for DB like MySQL)
    note the endpoint & port
  - Elastic Beanstalk (to run and manage web apps)
    "Environments": Upload jar file
    "Configurations": gradle, maven, IAM
    Load balancing, auto scaling etc.
  - S3 (for hosting)
    - Create a new S3 bucket
      - ACL disabled / enabled
      - Enable / Disable public access
    - Configure the S3 bucket  
      - Enable "Static Web Hosting"
      - Permissions
        - Bucket policy
        - S3, GetObject
        - Resource ARN
  - Publish the static files
    - Copy the static files with AWS CLI
      (or drag-n-drop to AWS console UI but this is not recommended)
