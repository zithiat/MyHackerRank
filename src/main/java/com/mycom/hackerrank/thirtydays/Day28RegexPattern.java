/*
 * https://www.hackerrank.com/challenges/30-regex-patterns/problem
 */
package com.mycom.hackerrank.thirtydays;

import java.util.*;
/**
 * @author hongquan.doan
 *
 */
public class Day28RegexPattern {

	private static Scanner sc;
	/**
	 * Sample inputs
6
riya riya@gmail.com
julia julia@julia.me
julia sjulia@gmail.com
julia julia@gmail.com
samantha samantha@gmail.com
tanya tanya@gmail.com

	 * Sample outputs
julia
julia
riya
samantha
tanya


30
riya riya@gmail.com
julia julia@julia.me
julia sjulia@gmail.com
julia julia@gmail.com
samantha samantha@gmail.com
tanya tanya@gmail.com
riya ariya@gmail.com
julia bjulia@julia.me
julia csjulia@gmail.com
julia djulia@gmail.com
samantha esamantha@gmail.com
tanya ftanya@gmail.com
riya riya@live.com
julia julia@live.com
julia sjulia@live.com
julia julia@live.com
samantha samantha@live.com
tanya tanya@live.com
riya ariya@live.com
julia bjulia@live.com
julia csjulia@live.com
julia djulia@live.com
samantha esamantha@live.com
tanya ftanya@live.com
riya gmail@riya.com
priya priya@gmail.com
preeti preeti@gmail.com
alice alice@alicegmail.com
alice alice@gmail.com
alice gmail.alice@gmail.com

alice
alice
julia
julia
julia
julia
preeti
priya
riya
riya
samantha
samantha
tanya
tanya

	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] arr = new String[n];
		sc.nextLine();
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextLine();
		}
		Arrays.sort(arr);
		for (String s : arr) {
			if (s.contains("@gmail.com")) {
				System.out.println(s.split("\\s")[0]);
			}
		}
	}

}
